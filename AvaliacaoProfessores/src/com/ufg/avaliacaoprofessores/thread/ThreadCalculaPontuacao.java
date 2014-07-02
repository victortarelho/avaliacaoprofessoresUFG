/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.thread;

import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.business.AvaliacaoBusiness;
import com.ufg.avaliacaoprofessores.enumerated.TipoAtividadeEnum;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class ThreadCalculaPontuacao implements Runnable{

    List<AvaliacaoDocente> listaAvaliacaoDocente;

    public ThreadCalculaPontuacao(List<AvaliacaoDocente> listaAvaliacaoDocente) {
        this.listaAvaliacaoDocente = listaAvaliacaoDocente;
    }
    
    @Override
    public void run() {

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
                    if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.ATIVIDADEENSINO.getDescricao())){
                        pontuacaoAtividadeDeEnsino += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.PRODUCAOINTELECTUAL.getDescricao())){
                        pontuacaoAtividadeProducaoIntelectual += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.ATIVIDADEPESQUISAEXTENSAO.getDescricao())){
                        pontuacaoAtividadePesquisa += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.ATIVIDADEADMINISTRATIVAREPRESENTACAO.getDescricao())){
                        pontuacaoAtividadeAdministrativa += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.OUTRASATIVIDADES.getDescricao())){
                        pontuacaoAtividadeOutras += (itemAvaliacao.getPontos() * itemAvaliacao.getHas());
                    }
                } else {
                    if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.ATIVIDADEENSINO.getDescricao())){
                        pontuacaoAtividadeDeEnsino += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.PRODUCAOINTELECTUAL.getDescricao())){
                        pontuacaoAtividadeProducaoIntelectual += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.ATIVIDADEPESQUISAEXTENSAO.getDescricao())){
                        pontuacaoAtividadePesquisa += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.ATIVIDADEADMINISTRATIVAREPRESENTACAO.getDescricao())){
                        pontuacaoAtividadeAdministrativa += itemAvaliacao.getPontos();
                    } else if(itemAvaliacao.getAtividade().getTipoAtividade().getTipoAtividadePai().getNome().equalsIgnoreCase(TipoAtividadeEnum.OUTRASATIVIDADES.getDescricao())){
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
            AvaliacaoBusiness.listaAvaliacaoDocenteFinal.add(avaliacaoDocente);
            
            System.out.println("Docente " + docente.getNome() + ": pontuacao = " + pontuacaoTotal);
        }
        
    }
    
}
