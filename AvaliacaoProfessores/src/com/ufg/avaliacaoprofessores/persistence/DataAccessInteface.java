/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.persistence;

import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author italogustavomirandamelo
 */
public interface DataAccessInteface {
    
    public void salvar(Object object) throws AvaliacaoDaoException;
    Object consultar(Class entidade, Long id) throws AvaliacaoDaoException;
    List listarFiltroHql(Class classeEntidade, Map parametros, String hql);
    List listar(Class clazz) throws Exception, SQLException, ConstraintViolationException;
    void excluir(Object object) throws AvaliacaoDaoException;
}
