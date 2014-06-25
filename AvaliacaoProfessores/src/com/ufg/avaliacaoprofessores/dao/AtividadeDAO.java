/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class AtividadeDAO extends GenericDao{
    
    public void salvar(Atividade atividade) {
        try {
            super.salvar(atividade);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(Atividade atividade) {
        try {
            super.excluir(atividade);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
    
    public List listar() throws Exception {
        List lista = new ArrayList();
        try {
            lista =  super.listar(Atividade.class);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
        return lista;
     }
}
