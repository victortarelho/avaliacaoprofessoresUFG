package com.ufg.avaliacaoprofessores.persistence;

import com.ufg.avaliacaoprofessores.exception.DaoException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 * @author italogustavomirandamelo
 */
public class GenericDao implements Serializable {

    public void salvar(Object object) throws DaoException{

        Session session = HibernateFactory.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(object);
            session.flush();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new DaoException("Problema ao armazenar dado.");
        } finally {
            session.close();
        }
    }

    public Object consultar(Class entidade, Long id) throws DaoException {
        Session session = HibernateFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Object result = null;
        try {
            result = session.load(entidade, id);
        } catch (Exception e) {
            transaction.rollback();
            throw new DaoException("Problema ao armazenar dado.");
        }
        
        return result;
    }

    public List listarFiltroHql(Class classeEntidade, Map parametros, String hql) {

        Session session = HibernateFactory.getSession();

        StringBuilder hqlQuery = new StringBuilder("from " + classeEntidade.getName() + " bean where 1=1 ");
        
        if(hql != null)
            hqlQuery.append(hql);

        Query query = session.createQuery(hqlQuery.toString());

        if (parametros != null) {
            Iterator iter = parametros.keySet().iterator();
            while (iter.hasNext()) {
                String name = (String) iter.next();
                Object value = parametros.get(name);
                query.setParameter(name, value);
            }
        }

        List lista = query.list();
        session.close();
        return lista;
    }

    public List listar(Class clazz) throws Exception, SQLException, ConstraintViolationException {

        Session session = HibernateFactory.getSession();
        Transaction transaction = session.beginTransaction();

        List objts;
        objts = null;
        Criteria selectAll = session.createCriteria(clazz);
        transaction.commit();
        objts = selectAll.list();
        session.close();
        return objts;
    }
    
    public void excluir(Object object) throws DaoException{

        Session session = HibernateFactory.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(object);
            session.flush();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new DaoException("Problema ao armazenar dado.");
        } finally {
            session.close();
        }
    }
}
