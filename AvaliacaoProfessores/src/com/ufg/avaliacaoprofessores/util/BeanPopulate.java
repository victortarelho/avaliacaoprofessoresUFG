/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.util;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.Avaliacao;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.dao.AtividadeDAO;
import com.ufg.avaliacaoprofessores.thread.ThreadPopulaBean;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import com.ufg.avaliacaoprofessores.vo.ItemAvaliacaoVO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author italogustavomirandamelo
 */
public class BeanPopulate {

    private AtividadeDAO atividadeDAO;
    private Map<Long, Atividade> atividades;
    public static List<AvaliacaoDocente> listaAvaliacaoDocente = new ArrayList<AvaliacaoDocente>();

    public Map<Long, Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Map<Long, Atividade> atividades) {
        this.atividades = atividades;
    }

    public List<AvaliacaoDocente> getListaAvaliacaoDocente() {
        return listaAvaliacaoDocente;
    }

    public void setListaAvaliacaoDocente(List<AvaliacaoDocente> listaAvaliacaoDocente) {
        this.listaAvaliacaoDocente = listaAvaliacaoDocente;
    }

    public BeanPopulate(AvaliacaoGeralVO avaliacaoGeralVO) {
        this.atividadeDAO = new AtividadeDAO();

        try {
            this.atividades = atividadeDAO.getMapaAtividades();
            popularBeans(avaliacaoGeralVO);
        } catch (Exception e) {
            System.out.println("Erro ao montar mapa de atividades");
            e.printStackTrace();
        }
    }

    private void popularBeans(AvaliacaoGeralVO avaliacaoGeralVO) {

        List<AvaliacaoProfessorVO> lista1 = avaliacaoGeralVO.getListaAvaliacoes().subList(0, 5000);
        List<AvaliacaoProfessorVO> lista2 = avaliacaoGeralVO.getListaAvaliacoes().subList(5001, 9999);
        
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setDataAvaliacao(Calendar.getInstance());
        avaliacaoGeralVO.setResolucao("32/2013");
        avaliacao.setResolucao(avaliacaoGeralVO.getResolucao());
        
        ThreadPopulaBean t1 = new ThreadPopulaBean(lista1, avaliacao, atividades);
        Thread treadPopulaBean1 = new Thread(t1);
        treadPopulaBean1.start();
        
        ThreadPopulaBean t2 = new ThreadPopulaBean(lista2, avaliacao, atividades);
        Thread treadPopulaBean2 = new Thread(t2);
        treadPopulaBean2.start();

    }
    
}
