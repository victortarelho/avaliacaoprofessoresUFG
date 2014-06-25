/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.dao.AtividadeDAO;
import javax.swing.JFrame;

/**
 *
 * @author Mario
 */
public class AtividadeController extends GenericController {

    @Override
    public void validaCadastro(JFrame janela) {
//        janela.
    }
    
    public void validaCadastro(Atividade atividade) {
        System.out.println("Teste"+atividade.getId());
         System.out.println("Teste"+atividade.getDescricao());
          System.out.println("Teste"+atividade.getPontos());
          AtividadeDAO atividadeDao = new AtividadeDAO();
          atividadeDao.salvar(atividade);
    }
    
}
