/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.util;

import com.ufg.avaliacaoprofessores.bean.Avaliacao;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author italogustavomirandamelo
 */
public class BeanPopulate {
    
    public void popularBeans(AvaliacaoGeralVO avaliacaoGeralVO){
        
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setDataAvaliacao(Calendar.getInstance());
        avaliacao.setResolucao(avaliacaoGeralVO.getResolucao());
        
        for(AvaliacaoProfessorVO avaliacaoProfessorVO : avaliacaoGeralVO.getListaAvaliacoes()){
            AvaliacaoDocente avaliacaoDocente = new AvaliacaoDocente();
            avaliacaoDocente.setAvaliacao(avaliacao);
            avaliacaoDocente.setItensAvaliacao(new ArrayList<ItemAvaliacao>());
        }
    }
}
