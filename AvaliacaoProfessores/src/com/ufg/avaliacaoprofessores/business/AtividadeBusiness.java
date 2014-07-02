/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.business;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.dao.AtividadeDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bruno
 */
public class AtividadeBusiness implements GenericBusiness {

    AtividadeDAO dao;

    public AtividadeBusiness() {
        dao = new AtividadeDAO();
    }

    public void salvaAtividade(Atividade atividade) {
        dao = new AtividadeDAO();
        dao.salvar(atividade);
    }

    public Atividade restoreAtividade(Long codigoAtividade) {
        Map parametros = new HashMap();
        parametros.put("codigo", codigoAtividade.toString());
        String hql = " and bean.codigo = :codigo";
        List<Atividade> listaAtividade = (List<Atividade>) dao.listarFiltroHql(Atividade.class, parametros, hql);
        
        if(!listaAtividade.isEmpty()){
            return listaAtividade.get(0);
        } else {
            return null;
        }
    }
    
    public void atualizaAtividade(Atividade atividade){
        Atividade ativAux = null;
        Map parametros = new HashMap();
        parametros.put("codigo", atividade.getCodigo().toString());
        String hql = " and bean.codigo = :codigo";
        List<Atividade> listaAtividade = (List<Atividade>) dao.listarFiltroHql(Atividade.class, parametros, hql);
        
        if(!listaAtividade.isEmpty()){
            ativAux = listaAtividade.get(0);
            atividade.setId(ativAux.getId());
            dao.salvar(atividade);
        } 
    }
    
    public List<Atividade> listarAtividades() throws Exception{
        List<Atividade> listAtividade = new ArrayList();
        listAtividade   = dao.listar();
        return listAtividade;
    }
}
