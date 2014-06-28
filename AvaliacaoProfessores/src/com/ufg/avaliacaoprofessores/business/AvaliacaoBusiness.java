/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.dao.AvaliacaoDAO;
import com.ufg.avaliacaoprofessores.dao.AvaliacaoDocenteDAO;
import com.ufg.avaliacaoprofessores.dao.DocenteDAO;
import com.ufg.avaliacaoprofessores.dao.ItemAvaliacaoDAO;
import com.ufg.avaliacaoprofessores.util.BeanPopulate;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class AvaliacaoBusiness {

    AvaliacaoDAO avaliacaoDao;
    AvaliacaoDocenteDAO avaliacaoDocenteDao;
    DocenteDAO docenteDao;
    ItemAvaliacaoDAO itemAvaliacaoDao;
    List<AvaliacaoDocente> listaAvaliacaoDocenteFinal = new ArrayList<AvaliacaoDocente>();

    public AvaliacaoBusiness() {
        this.avaliacaoDao = new AvaliacaoDAO();
        this.avaliacaoDocenteDao = new AvaliacaoDocenteDAO();
        this.docenteDao = new DocenteDAO();
        this.itemAvaliacaoDao = new ItemAvaliacaoDAO();
    }

    public void consomeJson(File arquivo) {
        AvaliacaoGeralVO avaliacao = null;
        try {
            avaliacao = carregaAvaliacao(arquivo);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AvaliacaoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        BeanPopulate beanPopulate = new BeanPopulate(avaliacao);
        List<AvaliacaoDocente> listaAvaliacaoDocente = beanPopulate.getListaAvaliacaoDocente();

//        persisteInformacoes(listaAvaliacaoDocente, beanPopulate);
        calculaPontuacao(listaAvaliacaoDocente);
    }

    private void persisteInformacoes(List<AvaliacaoDocente> listaAvaliacaoDocente, BeanPopulate beanPopulate) {
        System.out.println("Salvando Avaliação..");
        avaliacaoDao.salvar(beanPopulate.getAvaliacao());
        System.out.println("Avaliação salva.. id: " + beanPopulate.getAvaliacao().getId());

        for (AvaliacaoDocente avaliacaoDocente : listaAvaliacaoDocente) {
            if (avaliacaoDocente != null && avaliacaoDocente.getDocente() != null) {
                System.out.println("Salvando Docente: " + avaliacaoDocente.getDocente().getNome());
                docenteDao.salvar(avaliacaoDocente.getDocente());
                System.out.println("Docente salvo.. id:" + avaliacaoDocente.getDocente().getId());
            }

            if (avaliacaoDocente != null && beanPopulate != null && beanPopulate.getAvaliacao() != null) {
                System.out.println("Salvando Avaliação do Docente: ");
                avaliacaoDocente.setAvaliacao(beanPopulate.getAvaliacao());
                avaliacaoDocenteDao.salvar(avaliacaoDocente);
                System.out.println("Avaliação do docente salva... id:" + avaliacaoDocente.getId());
            }

            if (avaliacaoDocente != null && avaliacaoDocente.getItensAvaliacao() != null) {
                System.out.println("Salvando itens avaliacao do professor... Qtd: " + avaliacaoDocente.getItensAvaliacao().size());
                itemAvaliacaoDao.salvaEmBloco(avaliacaoDocente.getItensAvaliacao(), avaliacaoDocente.getId());
                System.out.println("Itens da avaliacao do professor salvos... ");
            }
        }
    }

    private AvaliacaoGeralVO carregaAvaliacao(File arquivo) throws UnsupportedEncodingException {
        Reader reader = new InputStreamReader(AvaliacaoBusiness.class.getResourceAsStream("/testeJson2.json"), "UTF-8");
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(reader, AvaliacaoGeralVO.class);
    }

    private void calculaPontuacao(List<AvaliacaoDocente> listaAvaliacaoDocente) {
        for (AvaliacaoDocente avaliacaoDocente : listaAvaliacaoDocente) {
            Docente docente = avaliacaoDocente.getDocente();
            List<ItemAvaliacao> listaItemAvaliacao = avaliacaoDocente.getItensAvaliacao();
            Float pontuacaoTotal = new Float(0.0);
            Float pontuacaoAtividadeDeEnsino = new Float(0.0);
            Float pontuacaoAtividadeProducaoIntelectual = new Float(0.0);
            Float pontuacaoAtividadePesquisa = new Float(0.0);
            Float pontuacaoAtividadeAdministrativa = new Float(0.0);
            Float pontuacaoAtividadeOutras = new Float(0.0);
            for (ItemAvaliacao itemAvaliacao : listaItemAvaliacao) {
                if (itemAvaliacao.getHas() != 0) {
                    if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("ATIVIDADES DE ENSINO")){
                        pontuacaoAtividadeDeEnsino += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("PRODUÇÃO INTELECTUAL")){
                        pontuacaoAtividadeProducaoIntelectual += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("ATIVIDADES DE PESQUISA E EXTENSÃO")){
                        pontuacaoAtividadePesquisa += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("ATIVIDADES ADMINISTRATIVAS E DE REPRESENTAÇÃO")){
                        pontuacaoAtividadeAdministrativa += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("OUTRAS ATIVIDADES")){
                        pontuacaoAtividadeOutras += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    }
                } else {
                    if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("ATIVIDADES DE ENSINO")){
                        pontuacaoAtividadeDeEnsino += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("PRODUÇÃO INTELECTUAL")){
                        pontuacaoAtividadeProducaoIntelectual += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("ATIVIDADES DE PESQUISA E EXTENSÃO")){
                        pontuacaoAtividadePesquisa += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("ATIVIDADES ADMINISTRATIVAS E DE REPRESENTAÇÃO")){
                        pontuacaoAtividadeAdministrativa += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase("OUTRAS ATIVIDADES")){
                        pontuacaoAtividadeOutras += itemAvaliacao.getPontos();
                    }
                }
            }
            pontuacaoTotal = pontuacaoAtividadeDeEnsino + pontuacaoAtividadeProducaoIntelectual + 
                    pontuacaoAtividadePesquisa + pontuacaoAtividadeAdministrativa + pontuacaoAtividadeOutras;
            
            avaliacaoDocente.setPontuacaoAtividadeAdministrativa(pontuacaoAtividadeAdministrativa);
            avaliacaoDocente.setPontuacaoAtividadeDeEnsino(pontuacaoAtividadeDeEnsino);
            avaliacaoDocente.setPontuacaoAtividadeOutras(pontuacaoAtividadeOutras);
            avaliacaoDocente.setPontuacaoAtividadePesquisa(pontuacaoAtividadePesquisa);
            avaliacaoDocente.setPontuacaoAtividadeProducaoIntelectual(pontuacaoAtividadeProducaoIntelectual);
            avaliacaoDocente.setPontuacaoTotal(pontuacaoTotal);
            listaAvaliacaoDocenteFinal.add(avaliacaoDocente);
            
            System.out.println("Docente " + docente.getNome() + ": pontuacao = " + pontuacaoTotal);
        }
    }

}
