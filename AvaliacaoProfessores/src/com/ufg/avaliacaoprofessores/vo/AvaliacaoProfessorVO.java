package com.ufg.avaliacaoprofessores.vo;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class AvaliacaoProfessorVO {
    
     private ProfessorVO professor;
     private List<ItemAvaliacaoVO> listaAtividades;

    public ProfessorVO getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorVO professor) {
        this.professor = professor;
    }

    public List<ItemAvaliacaoVO> getListaAtividades() {
        return listaAtividades;
    }

    public void setListaAtividades(List<ItemAvaliacaoVO> listaAtividades) {
        this.listaAtividades = listaAtividades;
    }

}
