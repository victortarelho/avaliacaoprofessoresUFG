package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.business.TipoAtividadeBusiness;
import com.ufg.avaliacaoprofessores.view.CadastroTipoAtividade;
import java.util.Iterator;
import java.util.List;
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
        tipoAtividadeBean.setNome(((CadastroTipoAtividade)janela).getDesc_tipo_ativ_txt().getText());
        tipoAtividadeBean.setCodigo(((CadastroTipoAtividade)janela).getCodigo_tipo_ativ_txt().getText());
        String comboAtividadePai = ((CadastroTipoAtividade)janela).getAtividadePaiCombo().getSelectedItem().toString();
        if(comboAtividadePai!= null && comboAtividadePai != ""){
            String idAtividadePai = comboAtividadePai.substring(0, comboAtividadePai.indexOf("-"));
            TipoAtividade tipoAtividadePai = new TipoAtividade();
            tipoAtividadePai.setId(Long.parseLong(idAtividadePai));
            tipoAtividadeBean.setTipoAtividadePai(tipoAtividadePai);
        }
        insereAtividade();
    }
    
    public void preencheComboTipoAtividadePai(JFrame janela) throws Exception{
        List listTipoAtividade = tipoAtividadeBusiness.listar();
       ((CadastroTipoAtividade)janela).getAtividadePaiCombo().addItem("");
        for (Iterator it = listTipoAtividade.iterator(); it.hasNext();) {
            TipoAtividade object = (TipoAtividade)it.next();
            ((CadastroTipoAtividade)janela).getAtividadePaiCombo().addItem(object.getId()+"-"+object.getNome());
        }
    }
    
    public void insereAtividade(){
        tipoAtividadeBusiness.salvaAtividade(tipoAtividadeBean);
        JOptionPane.showMessageDialog(null, "Tipo de Atividade cadastrado com sucesso!");
    }

    
}
