/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.thread;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.Avaliacao;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.util.BeanPopulate;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import com.ufg.avaliacaoprofessores.vo.ItemAvaliacaoVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bruno
 */
public class ThreadPopulaBean implements Runnable{

    private List<AvaliacaoProfessorVO> lista;
    private Avaliacao avaliacao;
    private Map<Long, Atividade> atividades;

    public List<AvaliacaoProfessorVO> getLista() {
        return lista;
    }

    public void setLista(List<AvaliacaoProfessorVO> lista) {
        this.lista = lista;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public ThreadPopulaBean(List<AvaliacaoProfessorVO> lista, Avaliacao avaliacao, Map<Long, Atividade> atividades) {
        this.lista = lista;
        this.avaliacao = avaliacao;
        this.atividades = atividades;
    }
    
    @Override
    public void run() {
        for (AvaliacaoProfessorVO avaliacaoProfessorVO : lista) {
            System.out.println(avaliacaoProfessorVO.getProfessor().getNomeProfessor());
            AvaliacaoDocente avaliacaoDocente = new AvaliacaoDocente();
            avaliacaoDocente.setAvaliacao(avaliacao);
            avaliacaoDocente.setItensAvaliacao(new ArrayList<ItemAvaliacao>());

            Docente docente = new Docente();
            docente.setNome(avaliacaoProfessorVO.getProfessor().getNomeProfessor());
            avaliacaoDocente.setDocente(docente);
            
            for (ItemAvaliacaoVO itemAvaliacaoVO : avaliacaoProfessorVO.getListaAtividades()) {
                ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
                if(atividades.get(Long.parseLong(itemAvaliacaoVO.getIdAtividade().toString())) != null){
                    itemAvaliacao.setAtividade(atividades.get(Long.parseLong(itemAvaliacaoVO.getIdAtividade().toString())));

                    if (itemAvaliacaoVO.getHas() != null && !itemAvaliacaoVO.getHas().equals("")) {
                        itemAvaliacao.setHas(new Integer(itemAvaliacaoVO.getHas()));
                        itemAvaliacao.setPontos(itemAvaliacao.getAtividade().getPontos() * itemAvaliacao.getHas());
                    } else {
                        itemAvaliacao.setPontos(itemAvaliacao.getAtividade().getPontos());
                    }
                }
            }
            BeanPopulate.listaAvaliacaoDocente.add(avaliacaoDocente);
        }
        
        
    }
    
}
