/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.exception.DaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author Mario
 */
public class TipoAtividadeDAO extends GenericDao {
    
    public void salvar(TipoAtividade tipoAtividade) {
        try {
            super.salvar(tipoAtividade);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(TipoAtividade tipoAtividade) {
        try {
            super.excluir(tipoAtividade);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
