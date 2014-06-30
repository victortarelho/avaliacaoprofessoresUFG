/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.business.AtividadeBusiness;
import com.ufg.avaliacaoprofessores.telas.CadastroAtividade;
import javax.swing.JFrame;

/**
 *
 * @author Mario
 */
public class AtividadeController extends GenericController {

    AtividadeBusiness atividadeBusiness;
    Atividade atividadeBean;

    public AtividadeController() {
        this.atividadeBusiness = new AtividadeBusiness();
    }
    
    @Override
    public void validaCadastro(JFrame janela) {
        atividadeBean = new Atividade();
        atividadeBean.setId(Long.parseLong(((CadastroAtividade)janela).getId_ativ_txt().getText()));
        atividadeBean.setDescricao(((CadastroAtividade)janela).getDesc_ativ_txt().getText());
        atividadeBean.setPontos(Long.parseLong(((CadastroAtividade)janela).getMax_pont_ativ_txt().getText()));
        atividadeBean.setTipoAtividade((TipoAtividade)(((CadastroAtividade)janela).getTipoAtividadeCombo().getSelectedItem()));
    }

    public void insereAtividade(){
        atividadeBusiness.salvaAtividade(atividadeBean);
    }

}
