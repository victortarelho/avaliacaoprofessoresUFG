package com.ufg.avaliacaoprofessores.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mario
 */
@Entity
public class ItemAvaliacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int has;
    
    private Float pontos;

    @ManyToOne
    @JoinColumn(name = "id_atividade", nullable = false)
    private Atividade atividade;

    @ManyToOne
    @JoinColumn(name = "id_avaliacao", nullable = false)
    private AvaliacaoDocente avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AvaliacaoDocente getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(AvaliacaoDocente avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getHas() {
        return has;
    }

    public void setHas(int has) {
        this.has = has;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Float getPontos() {
        return pontos;
    }

    public void setPontos(Float pontos) {
        this.pontos = pontos;
    }
}
