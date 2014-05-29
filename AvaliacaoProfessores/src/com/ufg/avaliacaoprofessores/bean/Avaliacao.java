/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mario
 */
@Entity
public class Avaliacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany()
    private List<ItemAvaliacao> itensAvaliacao;
    
    @ManyToOne
    private Professor professor;
    
    private float pontuacaoTotal;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAvaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List getItensAvaliacao() {
        return itensAvaliacao;
    }

    public void setItensAvaliacao(List itensAvaliacao) {
        this.itensAvaliacao = itensAvaliacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public float getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(float pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }

    public Calendar getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Calendar dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
  
}
