package com.ufg.avaliacaoprofessores.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class GerarTabelas {
    
    public static void main(String[] args){
        geraTabelas();
    }
    
    public static void geraTabelas(){
        EntityManagerFactory factoryProf = Persistence.createEntityManagerFactory("AvaliacaoProfessoresPU");
        EntityManager manager = factoryProf.createEntityManager();
        manager.clear();
        manager.close();
    }
    
}
