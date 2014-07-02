package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.business.TipoAtividadeBusiness;
import com.ufg.avaliacaoprofessores.view.CadastroTipoAtividade;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TipoAtividadeController extends GenericController{
    
    TipoAtividadeBusiness tipoAtividadeBusiness;
    TipoAtividade tipoAtividadeBean;
    
    public TipoAtividadeController() {
        this.tipoAtividadeBusiness = new TipoAtividadeBusiness();
    }

    @Override
    public void validaCadastro(JFrame janela) {
        tipoAtividadeBean = new TipoAtividade();
        tipoAtividadeBean.setId(Long.parseLong(((CadastroTipoAtividade)janela).getId_tipo_ativ_txt().getText()));
        tipoAtividadeBean.setNome(((CadastroTipoAtividade)janela).getDesc_tipo_ativ_txt().getText());
        tipoAtividadeBean.setCodigo(((CadastroTipoAtividade)janela).getCodigo_tipo_ativ_txt().getText());
        String comboAtividadePai = ((CadastroTipoAtividade)janela).getAtividadePaiCombo().getSelectedItem().toString();
        String idAtividadePai = null;
        if(comboAtividadePai != null && comboAtividadePai != ""){
            idAtividadePai = comboAtividadePai.substring(0, comboAtividadePai.indexOf("-"));
        } else{
            JOptionPane.showMessageDialog(null, "Insira a atividade pai!");
            return;
        }
        insereAtividade();
    }
    
    public void insereAtividade(){
        tipoAtividadeBusiness.salvaAtividade(tipoAtividadeBean);
        JOptionPane.showMessageDialog(null, "Atividade cadastrado com sucesso!");
    }

    
}
