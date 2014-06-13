package com.ufg.avaliacaoprofessores.persistence;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.Avaliacao;
import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.bean.ItemAvaliacao;
import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
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
        
        cfg.addAnnotatedClass(Docente.class);
        cfg.addAnnotatedClass(Atividade.class);
        cfg.addAnnotatedClass(Avaliacao.class);
        cfg.addAnnotatedClass(AvaliacaoDocente.class);
        cfg.addAnnotatedClass(ItemAvaliacao.class);
        cfg.addAnnotatedClass(TipoAtividade.class);
        
        factory = cfg.buildSessionFactory();
    }

    public static Session getSession(){
        return factory.openSession();
    }
    
}
