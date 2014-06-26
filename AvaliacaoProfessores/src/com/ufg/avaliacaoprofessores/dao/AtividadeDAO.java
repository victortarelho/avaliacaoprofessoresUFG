package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    public List<Atividade> listar() throws Exception {
        List<Atividade> lista = new ArrayList<Atividade>();
        try {
            lista =  super.listar(Atividade.class);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
        return lista;
     }
    
    public Map<String, Atividade> getMapaAtividades() throws Exception {
        
        List<Atividade> lista = listar();
        
        Map<String, Atividade> atividades = new HashMap<String, Atividade>();
        for(Atividade atividade : lista){
            atividades.put(atividade.getCodigo(), atividade);
        }
        
        return atividades;
    }
}
