package com.ufg.avaliacaoprofessores.controller;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.business.AtividadeBusiness;
import com.ufg.avaliacaoprofessores.telas.CadastroAtividade;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        atividadeBean.setCodigo(((CadastroAtividade)janela).getId_ativ_txt().getText());
        atividadeBean.setDescricao(((CadastroAtividade)janela).getDesc_ativ_txt().getText());
        atividadeBean.setPontos(Long.parseLong(((CadastroAtividade)janela).getMax_pont_ativ_txt().getText()));
        String comboTipoAtivide = ((CadastroAtividade)janela).getTipoAtividadeCombo().getSelectedItem().toString();
        String idTipoAtividade = null;
        if(comboTipoAtivide != null && comboTipoAtivide != ""){
            idTipoAtividade = comboTipoAtivide.substring(0, comboTipoAtivide.indexOf("-"));
        } else{
            JOptionPane.showMessageDialog(null, "Insira um tipo de atividade!");
            return;
        }
        TipoAtividade tipoAtividade = new TipoAtividade();
        tipoAtividade.setId(Long.parseLong(idTipoAtividade));
        atividadeBean.setTipoAtividade(tipoAtividade);
        insereAtividade();
    }

    public void insereAtividade(){
        atividadeBusiness.salvaAtividade(atividadeBean);
        JOptionPane.showMessageDialog(null, "Atividade cadastrado com sucesso!");
    }

}
