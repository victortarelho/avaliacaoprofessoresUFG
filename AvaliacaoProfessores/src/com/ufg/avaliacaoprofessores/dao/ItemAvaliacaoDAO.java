/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mario
 */
public class ItemAvaliacaoDAO extends GenericDao {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/avaliacaoProfessores";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASS = "postgres";

    public void salvar(ItemAvaliacao itemAvaliacao) {
        try {
            super.salvar(itemAvaliacao);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }

    public void deletar(ItemAvaliacao itemAvaliacao) {
        try {
            super.excluir(itemAvaliacao);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }

    public void salvaEmBloco(List<ItemAvaliacao> listaItemAvaliacao, Long avaliacaoId) {

        StringBuffer sqlInsert = new StringBuffer("INSERT INTO itemavaliacao ");
        sqlInsert.append("(id, has, pontos, id_atividade, id_avaliacao) ")
                .append("VALUES (nextval('hibernate_sequence'), ?, ?, ?, ?)");

        int i = 0;
        PreparedStatement pStatement = null;
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }

            pStatement = connection.prepareStatement(sqlInsert.toString());

            for (ItemAvaliacao itemAvaliacao : listaItemAvaliacao) {

                pStatement.setInt(1, itemAvaliacao.getHas());
                pStatement.setFloat(2, itemAvaliacao.getPontos());
                pStatement.setLong(3, itemAvaliacao.getAtividade().getId());
                pStatement.setLong(4, avaliacaoId);

                pStatement.addBatch();

                i++;
                if (i % 100 == 0) {
                    pStatement.executeBatch();
                    pStatement.clearBatch();
                    connection.commit();
                }
            }
            pStatement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            e.getNextException().printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
