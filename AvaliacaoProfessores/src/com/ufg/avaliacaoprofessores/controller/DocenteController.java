/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.dao.DocenteDAO;
import javax.swing.JFrame;

/**
 *
 * @author Ademar
 */
public class DocenteController extends GenericController {

    @Override
    public void validaCadastro(JFrame janela) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void validaCadastro(Docente docente) {
        DocenteDAO docenteDao = new DocenteDAO();
        docenteDao.salvar(docente);
    }
    
}
