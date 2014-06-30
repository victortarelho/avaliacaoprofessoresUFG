/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.business;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.dao.AtividadeDAO;

/**
 *
 * @author Bruno
 */
public class AtividadeBusiness implements GenericBusiness{
    
    public void salvaAtividade(Atividade atividade){
        System.out.println("Teste" + atividade.getId());
        System.out.println("Teste" + atividade.getDescricao());
        System.out.println("Teste" + atividade.getPontos());
        AtividadeDAO atividadeDao = new AtividadeDAO();
        atividadeDao.salvar(atividade);
    }
}
