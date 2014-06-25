/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class TipoAtividadeDAO extends GenericDao {
    
    public void salvar(TipoAtividade tipoAtividade) {
        try {
            super.salvar(tipoAtividade);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(TipoAtividade tipoAtividade) {
        try {
            super.excluir(tipoAtividade);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }
        public List listar() throws Exception {
        List lista = new ArrayList();
        try {
            lista =  super.listar(TipoAtividade.class);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
        return lista;
     }
}
