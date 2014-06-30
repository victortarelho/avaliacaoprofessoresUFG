/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.enumerados;

/**
 *
 * @author Bruno
 */
public enum TipoAtividadeEnum {
    
    ATIVIDADEENSINO("ATIVIDADES DE ENSINO"),
    PRODUCAOINTELECTUAL("PRODUÇÃO INTELECTUAL"),
    ATIVIDADEPESQUISAEXTENSAO("ATIVIDADES DE PESQUISA E EXTENSÃO"),
    ATIVIDADEADMINISTRATIVAREPRESENTACAO("ATIVIDADES ADMINISTRATIVAS E DE REPRESENTAÇÃO"),
    OUTRASATIVIDADES("OUTRAS ATIVIDADES");

    private TipoAtividadeEnum(String descricao) {
        this.descricao = descricao;
    }
    
    String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
