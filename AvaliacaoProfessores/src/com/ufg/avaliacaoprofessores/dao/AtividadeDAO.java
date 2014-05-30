/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.exception.DaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author Mario
 */
public class AtividadeDAO extends GenericDao{
    
    public void salvar(Atividade atividade) {
        try {
            super.salvar(atividade);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(Atividade atividade) {
        try {
            super.excluir(atividade);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
