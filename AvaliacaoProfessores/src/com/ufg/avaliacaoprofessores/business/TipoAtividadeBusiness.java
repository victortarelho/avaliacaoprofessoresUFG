/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.business;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.dao.TipoAtividadeDAO;

/**
 *
 * @author victor.tarelho
 */
public class TipoAtividadeBusiness implements GenericBusiness{
    public void salvaAtividade(TipoAtividade tipoAtividade){
        TipoAtividadeDAO tipoAtividadeDao = new TipoAtividadeDAO();
        tipoAtividadeDao.salvar(tipoAtividade);
    }
}
