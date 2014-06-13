package com.ufg.avaliacaoprofessores.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author italogustavomirandamelo
 */
@Entity
public class Avaliacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "resolucao", nullable = false, length=100)
    private String resolucao;
    
    @OneToMany(mappedBy = "avaliacao",cascade = { CascadeType.ALL })
    private List<AvaliacaoDocente> avaliacoesDocentes;
    
    private float pontuacaoTotal;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAvaliacao;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public List<AvaliacaoDocente> getAvaliacoesDocentes() {
        return avaliacoesDocentes;
    }

    public void setAvaliacoesDocentes(List<AvaliacaoDocente> avaliacoesDocentes) {
        this.avaliacoesDocentes = avaliacoesDocentes;
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
