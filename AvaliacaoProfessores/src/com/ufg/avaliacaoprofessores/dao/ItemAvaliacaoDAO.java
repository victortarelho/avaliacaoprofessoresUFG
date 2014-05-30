/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.exception.DaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author Mario
 */
public class ItemAvaliacaoDAO extends GenericDao {
        public void salvar(ItemAvaliacao itemAvaliacao) {
        try {
            super.salvar(itemAvaliacao);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(ItemAvaliacao itemAvaliacao){
        try {
            super.excluir(itemAvaliacao);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
