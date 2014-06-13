package com.ufg.avaliacaoprofessores.bean;

import java.io.Serializable;
import javax.persistence.CascadeType;
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
public class TipoAtividade implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    
    private String codigo;

    public TipoAtividade(){}
    
    public TipoAtividade(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tipo_pai", nullable = true)
    private TipoAtividade tipoAtividadePai;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public TipoAtividade getTipoAtividadePai() {
        return tipoAtividadePai;
    }

    public void setTipoAtividadePai(TipoAtividade tipoAtividadePai) {
        this.tipoAtividadePai = tipoAtividadePai;
    } 
}
