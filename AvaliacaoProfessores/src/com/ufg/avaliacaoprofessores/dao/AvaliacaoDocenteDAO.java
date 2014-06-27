/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;

/**
 *
 * @author italogustavomirandamelo
 */
public class AvaliacaoDocenteDAO extends GenericDao {
    
    public void salvar(AvaliacaoDocente avaliacaoDocente) {
        try {
            super.salvar(avaliacaoDocente);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(AvaliacaoDocente avaliacaoDocente){
        try {
            super.excluir(avaliacaoDocente);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
