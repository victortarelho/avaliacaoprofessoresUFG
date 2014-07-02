/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.business.DocenteBusiness;
import com.ufg.avaliacaoprofessores.view.CadastroDocente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ademar
 */
public class DocenteController extends GenericController {

    Docente docenteBean;
    DocenteBusiness docenteBusiness;

    public DocenteController() {
        this.docenteBean = new Docente();
        this.docenteBusiness = new DocenteBusiness();
    }
    
    @Override
    public void validaCadastro(JFrame janela) {
        CadastroDocente cadDocente = (CadastroDocente) janela;
        docenteBean = new Docente();
        docenteBean.setNome(cadDocente.getNome_doc_txt().getText());
        docenteBean.setMatricula(Long.parseLong(cadDocente.getMat_doc_txt().getText()));
        docenteBean.setUnidade(cadDocente.getUnid_dep_doc_txt().getText());
        docenteBean.setRegime(cadDocente.getRegime_doc_txt().getText());
    }

    public void insereDocente(){
        docenteBusiness.salvaDocente(docenteBean);
        JOptionPane.showMessageDialog(null, "Docente cadastrado com sucesso!");
    }
}
