/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.business;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.dao.DocenteDAO;

/**
 *
 * @author Bruno
 */
public class DocenteBusiness implements GenericBusiness {

    public void salvaDocente(Docente docente) {
        DocenteDAO docenteDao = new DocenteDAO();
        docenteDao.salvar(docente);
    }

}
