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
import javax.persistence.Transient;

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
    
    @Transient
    Float pontuacaoAtividadeDeEnsino = new Float(0.0);
    
    @Transient
    Float pontuacaoAtividadeProducaoIntelectual = new Float(0.0);
    
    @Transient
    Float pontuacaoAtividadePesquisa = new Float(0.0);
    
    @Transient
    Float pontuacaoAtividadeAdministrativa = new Float(0.0);
    
    @Transient
    Float pontuacaoAtividadeOutras = new Float(0.0);
    
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

    public Float getPontuacaoAtividadeDeEnsino() {
        return pontuacaoAtividadeDeEnsino;
    }

    public void setPontuacaoAtividadeDeEnsino(Float pontuacaoAtividadeDeEnsino) {
        this.pontuacaoAtividadeDeEnsino = pontuacaoAtividadeDeEnsino;
    }

    public Float getPontuacaoAtividadeProducaoIntelectual() {
        return pontuacaoAtividadeProducaoIntelectual;
    }

    public void setPontuacaoAtividadeProducaoIntelectual(Float pontuacaoAtividadeProducaoIntelectual) {
        this.pontuacaoAtividadeProducaoIntelectual = pontuacaoAtividadeProducaoIntelectual;
    }

    public Float getPontuacaoAtividadePesquisa() {
        return pontuacaoAtividadePesquisa;
    }

    public void setPontuacaoAtividadePesquisa(Float pontuacaoAtividadePesquisa) {
        this.pontuacaoAtividadePesquisa = pontuacaoAtividadePesquisa;
    }

    public Float getPontuacaoAtividadeAdministrativa() {
        return pontuacaoAtividadeAdministrativa;
    }

    public void setPontuacaoAtividadeAdministrativa(Float pontuacaoAtividadeAdministrativa) {
        this.pontuacaoAtividadeAdministrativa = pontuacaoAtividadeAdministrativa;
    }

    public Float getPontuacaoAtividadeOutras() {
        return pontuacaoAtividadeOutras;
    }

    public void setPontuacaoAtividadeOutras(Float pontuacaoAtividadeOutras) {
        this.pontuacaoAtividadeOutras = pontuacaoAtividadeOutras;
    }

}
