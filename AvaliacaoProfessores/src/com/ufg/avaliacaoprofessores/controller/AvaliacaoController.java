/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.business.AvaliacaoBusiness;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class AvaliacaoController extends GenericController{

    AvaliacaoBusiness avaliacaoBusiness;

    public AvaliacaoController() {
        avaliacaoBusiness = new AvaliacaoBusiness();
    }
    
    
    
    @Override
    public void validaCadastro(JFrame viewCadastro) {
        //implementar validacao dos campos
//        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void validaJson(File arquivo){
        //http://json-schema.org/examples.html
    }
    
    public void persisteJson(File arquivo){
        avaliacaoBusiness.persisteJson(arquivo);
        JOptionPane.showMessageDialog(null, "JSON persistido!");
    }
    
    public void realizaAvaliacaoJson(File arquivo){
        avaliacaoBusiness.realizaAvaliacaoJson(arquivo);
    }
    
    public void ordenaListaPorNome(JFrame jframe){
        avaliacaoBusiness.ordenaListaPorNome();
        jframe.setVisible(false);
    }
    
    public void ordenaListaPorNota(JFrame jframe){
        avaliacaoBusiness.ordenaListaPorNota();
        jframe.setVisible(false);
    }
}
