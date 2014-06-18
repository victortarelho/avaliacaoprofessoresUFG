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
 public class AvaliacaoGeralVO{
        private List<AvaliacaoProfessorVO> listaAvaliacoes;

        public List<AvaliacaoProfessorVO> getListaAvaliacoes() {
            return listaAvaliacoes;
        }

        public void setListaAvaliacoes(List<AvaliacaoProfessorVO> listaAvaliacoes) {
            this.listaAvaliacoes = listaAvaliacoes;
        }

        @Override
        public String toString() {
           return "AvaliacaoGeral [listaAvaliacoes="
                + listaAvaliacoes + "]";
        }
        
    }
