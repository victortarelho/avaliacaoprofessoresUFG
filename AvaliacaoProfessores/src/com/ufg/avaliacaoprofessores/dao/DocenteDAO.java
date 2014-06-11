/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author italogustavomirandamelo
 */
public class DocenteDAO extends GenericDao{
    
    public void salvar(Docente docente) {
        try {
            super.salvar(docente);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(Docente docente) {
        try {
            super.excluir(docente);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
}
