/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.util;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.Avaliacao;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.dao.AtividadeDAO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import com.ufg.avaliacaoprofessores.vo.ItemAvaliacaoVO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author italogustavomirandamelo
 */
public class BeanPopulate {

    private AtividadeDAO atividadeDAO;
    private Map<Long, Atividade> atividades;
    private List<AvaliacaoDocente> listaAvaliacaoDocente = new ArrayList<AvaliacaoDocente>();

    public Map<Long, Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Map<Long, Atividade> atividades) {
        this.atividades = atividades;
    }

    public List<AvaliacaoDocente> getListaAvaliacaoDocente() {
        return listaAvaliacaoDocente;
    }

    public void setListaAvaliacaoDocente(List<AvaliacaoDocente> listaAvaliacaoDocente) {
        this.listaAvaliacaoDocente = listaAvaliacaoDocente;
    }

    public BeanPopulate(AvaliacaoGeralVO avaliacaoGeralVO) {
        this.atividadeDAO = new AtividadeDAO();

        try {
            this.atividades = atividadeDAO.getMapaAtividades();
            popularBeans(avaliacaoGeralVO);
        } catch (Exception e) {
            System.out.println("Erro ao montar mapa de atividades");
            e.printStackTrace();
        }
    }

    private void popularBeans(AvaliacaoGeralVO avaliacaoGeralVO) {

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setDataAvaliacao(Calendar.getInstance());
        avaliacao.setResolucao(avaliacaoGeralVO.getResolucao());

        for (AvaliacaoProfessorVO avaliacaoProfessorVO : avaliacaoGeralVO.getListaAvaliacoes()) {
            System.out.println(avaliacaoProfessorVO.getProfessor().getNomeProfessor());
            AvaliacaoDocente avaliacaoDocente = new AvaliacaoDocente();
            avaliacaoDocente.setAvaliacao(avaliacao);
            avaliacaoDocente.setItensAvaliacao(new ArrayList<ItemAvaliacao>());

            for (ItemAvaliacaoVO itemAvaliacaoVO : avaliacaoProfessorVO.getListaAtividades()) {
                ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
                itemAvaliacao.setAtividade(atividades.get(itemAvaliacaoVO.getIdAtividade()));

                if (itemAvaliacaoVO.getHas() != null && !itemAvaliacaoVO.getHas().equals("")) {
                    itemAvaliacao.setHas(new Integer(itemAvaliacaoVO.getHas()));
                    itemAvaliacao.setPontos(itemAvaliacao.getAtividade().getPontos() * itemAvaliacao.getHas());
                } else {
                    itemAvaliacao.setPontos(itemAvaliacao.getAtividade().getPontos());
                }
            }
            listaAvaliacaoDocente.add(avaliacaoDocente);
        }
    }
}
