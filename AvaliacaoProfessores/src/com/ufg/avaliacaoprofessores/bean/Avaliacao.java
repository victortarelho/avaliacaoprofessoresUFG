package com.ufg.avaliacaoprofessores.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author italogustavomirandamelo
 */
public class Avaliacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "resolucao", nullable = false, length=100)
    private String resolucao;
    
    @OneToMany(mappedBy = "avaliacao",cascade = { CascadeType.ALL })
    private List<AvaliacaoDocente> avaliacoesDocentes;

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
    
    
    
    
}
