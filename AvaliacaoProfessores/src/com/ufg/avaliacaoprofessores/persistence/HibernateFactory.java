package com.ufg.avaliacaoprofessores.persistence;

import com.ufg.avaliacaoprofessores.bean.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author italogustavomirandamelo
 */
public class HibernateFactory {
    private static SessionFactory factory;

    static{
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        cfg.addAnnotatedClass(Professor.class);
        
        factory = cfg.buildSessionFactory();
    }

    public static Session getSession(){
        return factory.openSession();
    }
    
}
