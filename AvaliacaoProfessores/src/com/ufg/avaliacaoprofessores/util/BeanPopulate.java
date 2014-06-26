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
import java.util.Map;

/**
 *
 * @author italogustavomirandamelo
 */
public class BeanPopulate {
    
    AtividadeDAO atividadeDAO;
    Map<String, Atividade> atividades;
    
    public BeanPopulate(){
        this.atividadeDAO = new AtividadeDAO();
        
        
        try {
            this.atividades = atividadeDAO.getMapaAtividades();
        } catch (Exception e) {
            System.out.println("Erro ao montar mapa de atividades");
            e.printStackTrace();
        }
    }
    
    public void popularBeans(AvaliacaoGeralVO avaliacaoGeralVO){
        
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setDataAvaliacao(Calendar.getInstance());
        avaliacao.setResolucao(avaliacaoGeralVO.getResolucao());
        
        for(AvaliacaoProfessorVO avaliacaoProfessorVO : avaliacaoGeralVO.getListaAvaliacoes()){
            AvaliacaoDocente avaliacaoDocente = new AvaliacaoDocente();
            avaliacaoDocente.setAvaliacao(avaliacao);
            avaliacaoDocente.setItensAvaliacao(new ArrayList<ItemAvaliacao>());
            
            for(ItemAvaliacaoVO itemAvaliacaoVO :  avaliacaoProfessorVO.getListaAtividades()){
                ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
                itemAvaliacao.setAtividade(atividades.get(itemAvaliacaoVO.getCodigoAtividade()));
                
                if(itemAvaliacaoVO.getInformacaoExtra() != null && !itemAvaliacaoVO.getInformacaoExtra().equals("")){
                    itemAvaliacao.setHas(new Integer(itemAvaliacaoVO.getInformacaoExtra()));
                }
            }
        }
    }
}
