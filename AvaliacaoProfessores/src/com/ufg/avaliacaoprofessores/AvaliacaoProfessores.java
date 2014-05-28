/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores;

import com.ufg.avaliacaoprofessores.bean.Professor;
import com.ufg.avaliacaoprofessores.dao.ProfessorDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author italogustavomirandamelo
 */
public class AvaliacaoProfessores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Professor prof = new Professor();
        prof.setNome("Professor Teste");
        
        ProfessorDAO professorDAO = new ProfessorDAO();
        professorDAO.salvar(prof);
            
    }
}
