/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.comparer.AvaliacaoComparerByNota;
import com.ufg.avaliacaoprofessores.comparer.AvaliacaoComparerByNomeDocente;
import com.ufg.avaliacaoprofessores.dao.AvaliacaoDAO;
import com.ufg.avaliacaoprofessores.dao.AvaliacaoDocenteDAO;
import com.ufg.avaliacaoprofessores.dao.DocenteDAO;
import com.ufg.avaliacaoprofessores.dao.ItemAvaliacaoDAO;
import com.ufg.avaliacaoprofessores.view.VisualizaAvaliacaoGeral;
import com.ufg.avaliacaoprofessores.thread.ThreadCalculaPontuacao;
import com.ufg.avaliacaoprofessores.util.BeanPopulate;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class AvaliacaoBusiness implements GenericBusiness{

    private AvaliacaoDAO avaliacaoDao;
    private AvaliacaoDocenteDAO avaliacaoDocenteDao;
    private DocenteDAO docenteDao;
    private ItemAvaliacaoDAO itemAvaliacaoDao;
    public static List<AvaliacaoDocente> listaAvaliacaoDocenteFinal = 
            Collections.synchronizedList(new ArrayList<AvaliacaoDocente>());

    public AvaliacaoBusiness() {
        this.avaliacaoDao = new AvaliacaoDAO();
        this.avaliacaoDocenteDao = new AvaliacaoDocenteDAO();
        this.docenteDao = new DocenteDAO();
        this.itemAvaliacaoDao = new ItemAvaliacaoDAO();
    }

    public void persisteJson(File arquivo) {
        AvaliacaoGeralVO avaliacao = null;
        try {
            avaliacao = carregaAvaliacao(arquivo);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AvaliacaoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        BeanPopulate beanPopulate = new BeanPopulate(avaliacao);
        List<AvaliacaoDocente> listaAvaliacaoDocente = beanPopulate.getListaAvaliacaoDocente();

        persisteInformacoes(listaAvaliacaoDocente, beanPopulate);
    }
    
    public void realizaAvaliacaoJson(File arquivo) {
        AvaliacaoGeralVO avaliacao = null;
        try {
            avaliacao = carregaAvaliacao(arquivo);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AvaliacaoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        BeanPopulate beanPopulate = new BeanPopulate(avaliacao);
        List<AvaliacaoDocente> listaAvaliacaoDocente = beanPopulate.getListaAvaliacaoDocente();

        calculaPontuacao(listaAvaliacaoDocente);
    }

    private void persisteInformacoes(List<AvaliacaoDocente> listaAvaliacaoDocente, BeanPopulate beanPopulate) {
        System.out.println("Salvando Avaliação..");
        avaliacaoDao.salvar(beanPopulate.getAvaliacao());
        System.out.println("Avaliação salva.. id: " + beanPopulate.getAvaliacao().getId());

        for (AvaliacaoDocente avaliacaoDocente : listaAvaliacaoDocente) {
            if (avaliacaoDocente != null && avaliacaoDocente.getDocente() != null) {
                System.out.println("Salvando Docente: " + avaliacaoDocente.getDocente().getNome());
                docenteDao.salvar(avaliacaoDocente.getDocente());
                System.out.println("Docente salvo.. id:" + avaliacaoDocente.getDocente().getId());
            }

            if (avaliacaoDocente != null && beanPopulate != null && beanPopulate.getAvaliacao() != null) {
                System.out.println("Salvando Avaliação do Docente: ");
                avaliacaoDocente.setAvaliacao(beanPopulate.getAvaliacao());
                avaliacaoDocenteDao.salvar(avaliacaoDocente);
                System.out.println("Avaliação do docente salva... id:" + avaliacaoDocente.getId());
            }

            if (avaliacaoDocente != null && avaliacaoDocente.getItensAvaliacao() != null) {
                System.out.println("Salvando itens avaliacao do professor... Qtd: " + avaliacaoDocente.getItensAvaliacao().size());
                itemAvaliacaoDao.salvaEmBloco(avaliacaoDocente.getItensAvaliacao(), avaliacaoDocente.getId());
                System.out.println("Itens da avaliacao do professor salvos... ");
            }
        }
    }

    private AvaliacaoGeralVO carregaAvaliacao(File arquivo) throws UnsupportedEncodingException {
        Reader reader = new InputStreamReader(AvaliacaoBusiness.class.getResourceAsStream("/testeJson2.json"), "UTF-8");
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(reader, AvaliacaoGeralVO.class);
    }

    private void calculaPontuacao(List<AvaliacaoDocente> listaAvaliacaoDocente) {
        
        List<AvaliacaoDocente> lista1 = listaAvaliacaoDocente.subList(0, 5000);
        List<AvaliacaoDocente> lista2 = listaAvaliacaoDocente.subList(5001, listaAvaliacaoDocente.size());

        ThreadCalculaPontuacao t1 = new ThreadCalculaPontuacao(lista1);
        Thread treadCalcula1 = new Thread(t1);
        treadCalcula1.start();

        ThreadCalculaPontuacao t2 = new ThreadCalculaPontuacao(lista2);
        Thread treadCalcula2 = new Thread(t2);
        treadCalcula2.start();

        try {
            treadCalcula1.join();
            treadCalcula2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Total avaliacoes:" + listaAvaliacaoDocenteFinal.size());
        VisualizaAvaliacaoGeral jFrame = new VisualizaAvaliacaoGeral();
        jFrame.carregaListaAvaliacoes(listaAvaliacaoDocenteFinal);
        jFrame.setVisible(true);
        
    }
    
    public void ordenaListaPorNome(){
        Collections.sort(listaAvaliacaoDocenteFinal, new AvaliacaoComparerByNomeDocente());
        VisualizaAvaliacaoGeral jFrame = new VisualizaAvaliacaoGeral();
        jFrame.carregaListaAvaliacoes(listaAvaliacaoDocenteFinal);
        jFrame.setVisible(true);
    }

    public void ordenaListaPorNota(){
        Collections.sort(listaAvaliacaoDocenteFinal, new AvaliacaoComparerByNota());
        VisualizaAvaliacaoGeral jFrame = new VisualizaAvaliacaoGeral();
        jFrame.carregaListaAvaliacoes(listaAvaliacaoDocenteFinal);
        jFrame.setVisible(true);
    }
}
