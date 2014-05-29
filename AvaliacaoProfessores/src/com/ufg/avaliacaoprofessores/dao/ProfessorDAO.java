/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.Professor;
import com.ufg.avaliacaoprofessores.exception.DaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author italogustavomirandamelo
 */
public class ProfessorDAO extends GenericDao{
    
    public void salvar(Professor professor) {
        try {
            super.salvar(professor);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(Professor professor) {
        try {
            super.excluir(professor);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
