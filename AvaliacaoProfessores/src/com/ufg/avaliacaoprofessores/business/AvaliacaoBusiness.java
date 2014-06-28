/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.dao.AvaliacaoDAO;
import com.ufg.avaliacaoprofessores.dao.AvaliacaoDocenteDAO;
import com.ufg.avaliacaoprofessores.dao.DocenteDAO;
import com.ufg.avaliacaoprofessores.dao.ItemAvaliacaoDAO;
import com.ufg.avaliacaoprofessores.util.BeanPopulate;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class AvaliacaoBusiness {
    
    AvaliacaoDAO avaliacaoDao;
    AvaliacaoDocenteDAO avaliacaoDocenteDao;
    DocenteDAO docenteDao;
    ItemAvaliacaoDAO itemAvaliacaoDao;
    
    public AvaliacaoBusiness(){
        this.avaliacaoDao = new AvaliacaoDAO();
        this.avaliacaoDocenteDao = new AvaliacaoDocenteDAO();
        this.docenteDao = new DocenteDAO();
        this.itemAvaliacaoDao = new ItemAvaliacaoDAO();
    }

    public void consomeJson(File arquivo) {
        AvaliacaoGeralVO avaliacao = null;
        try {
            avaliacao = carregaAvaliacao(arquivo);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AvaliacaoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        BeanPopulate beanPopulate = new BeanPopulate(avaliacao);
        List<AvaliacaoDocente> listaAvaliacaoDocente = beanPopulate.getListaAvaliacaoDocente();
        
        System.out.println("Salvando Avaliação..");
        avaliacaoDao.salvar(beanPopulate.getAvaliacao());
        System.out.println("Avaliação salva.. id: " + beanPopulate.getAvaliacao().getId());
        
        for(AvaliacaoDocente avaliacaoDocente : listaAvaliacaoDocente){
            System.out.println("Salvando Docente: " + avaliacaoDocente.getDocente().getNome());
            docenteDao.salvar(avaliacaoDocente.getDocente());
            System.out.println("Docente salvo.. id:" + avaliacaoDocente.getDocente().getId());
            
            System.out.println("Salvando Avaliação do Docente: ");
            avaliacaoDocente.setAvaliacao(beanPopulate.getAvaliacao());
            avaliacaoDocenteDao.salvar(avaliacaoDocente);
            System.out.println("Avaliação do docente salva... id:" + avaliacaoDocente.getId());
            
            System.out.println("Salvando itens avaliacao do professor... Qtd: "+ avaliacaoDocente.getItensAvaliacao().size());
            itemAvaliacaoDao.salvaEmBloco(avaliacaoDocente.getItensAvaliacao(), avaliacaoDocente.getId());
            System.out.println("Itens da avaliacao do professor salvos... ");
        }
        
        persisteItemAvaliacao(listaAvaliacaoDocente);
    }

    private AvaliacaoGeralVO carregaAvaliacao(File arquivo) throws UnsupportedEncodingException {
        Reader reader = new InputStreamReader(AvaliacaoBusiness.class.getResourceAsStream("/testeJson2.json"), "UTF-8");
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(reader, AvaliacaoGeralVO.class);
    }

    private List<Docente> getListaDocentes(List<AvaliacaoDocente> listaAvaliacaoDocente) {
        List<Docente> listaDocentes = new ArrayList<Docente>();
        for (AvaliacaoDocente avaliacaoDocente : listaAvaliacaoDocente) {
            listaDocentes.add(avaliacaoDocente.getDocente());
        }
        return listaDocentes;
    }
    
    private void persisteItemAvaliacao(List<AvaliacaoDocente> listaAvaliacaoDocente){
        //persistir os itens de avaliacao - Bruno - faz em bloco igual eu, metodo salvaEmBloco no docenteDao
    }
}
