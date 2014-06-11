/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Mario
 */
@Entity
public class AvaliacaoDocente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_avaliacao", nullable = false)
    private Avaliacao avaliacao;
    
    @OneToMany(mappedBy = "avaliacao", cascade = {CascadeType.REMOVE})
    private List<ItemAvaliacao> itensAvaliacao;
    
    @ManyToOne
    @JoinColumn(name = "id_docente", nullable = false)
    private Docente docente;
    
    private float pontuacaoTotal;
    
    public List<ItemAvaliacao> getItensAvaliacao() {
        return itensAvaliacao;
    }

    public void setItensAvaliacao(List<ItemAvaliacao> itensAvaliacao) {
        this.itensAvaliacao = itensAvaliacao;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(float pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}
