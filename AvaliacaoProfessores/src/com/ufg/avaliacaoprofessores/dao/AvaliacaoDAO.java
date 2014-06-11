/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author Mario
 */
public class AvaliacaoDAO extends GenericDao {
    public void salvar(AvaliacaoDocente avaliacao) {
        try {
            super.salvar(avaliacao);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(AvaliacaoDocente avaliacao){
        try {
            super.excluir(avaliacao);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
}
