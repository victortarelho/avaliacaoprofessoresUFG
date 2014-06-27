/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.dao;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.exception.AvaliacaoDaoException;
import com.ufg.avaliacaoprofessores.persistence.GenericDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author italogustavomirandamelo
 */
public class DocenteDAO extends GenericDao {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/avaliacaoProfessores";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASS = "postgres";

    public void salvar(Docente docente) {
        try {
            super.salvar(docente);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }

    public void deletar(Docente docente) {
        try {
            super.excluir(docente);
        } catch (AvaliacaoDaoException e) {
            e.printStackTrace();
        }
    }

    public void salvaEmBloco(List<Docente> listaDocentes) {

        StringBuffer sqlInsert = new StringBuffer("INSERT INTO docente ");
        sqlInsert.append("(id, matricula, nome, regime, unidade) ")
                .append("VALUES (?, ?, ?, ?, ?)");

        int i = 0;
        PreparedStatement pStatement = null;
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }

            pStatement = connection.prepareStatement(sqlInsert.toString());

            for (Docente docente : listaDocentes) {

                pStatement.setLong(1, i+1);
                pStatement.setLong(2, i+1);
                pStatement.setString(3, docente.getNome());
                pStatement.setString(4, "Regime Total");
                pStatement.setString(5, "INF");

                pStatement.addBatch();

                i++;
                if (i % 200 == 0) {
                    pStatement.executeBatch();
                    pStatement.clearBatch();
                    connection.commit();
                }
            }
            pStatement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
