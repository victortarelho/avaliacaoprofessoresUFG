/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.dao.DocenteDAO;

/**
 *
 * @author italogustavomirandamelo
 */
public class AvaliacaoProfessores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Docente prof = new Docente();
        prof.setNome("Professor Teste");
        
        DocenteDAO professorDAO = new DocenteDAO();
        professorDAO.salvar(prof);
            
    }
}
