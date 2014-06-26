package com.ufg.avaliacaoprofessores;

import com.ufg.avaliacaoprofessores.vo.ProfessorVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import com.ufg.avaliacaoprofessores.vo.ItemAvaliacaoVO;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bruno
 */
public class GeradorJson {

    public static void main(String[] args) {

        geraEImprimeJsonTeste();
    }

    public static void geraEImprimeJsonTeste() {
        //gerar json com gson
        AvaliacaoGeralVO avaliacao = new AvaliacaoGeralVO();

        List<AvaliacaoProfessorVO> listaAvaliacoes = new ArrayList<AvaliacaoProfessorVO>();

        //avaliacao 1
//        AvaliacaoProfessorVO av1 = new AvaliacaoProfessorVO();
//        ProfessorVO p1 = new ProfessorVO();
//        p1.setIdProfessor(1);
//        p1.setNomeProfessor("Nome1");
//        av1.setProfessor(p1);
//        List<ItemAvaliacaoVO> listaAtividadesAv1 = new ArrayList<ItemAvaliacaoVO>();
//        ItemAvaliacaoVO atividade1 = new ItemAvaliacaoVO();
//        atividade1.setCodigoAtividade("1");
//        atividade1.setHas("10");
//        listaAtividadesAv1.add(atividade1);
//        av1.setListaAtividades(listaAtividadesAv1);
//        listaAvaliacoes.add(av1);
//
//        //avaliacao 2
//        AvaliacaoProfessorVO av2 = new AvaliacaoProfessorVO();
//        ProfessorVO p2 = new ProfessorVO();
//        p2.setIdProfessor(2);
//        p2.setNomeProfessor("Nome2");
//        av2.setProfessor(p2);
//        List<ItemAvaliacaoVO> listaAtividadesAv2 = new ArrayList<ItemAvaliacaoVO>();
//        ItemAvaliacaoVO atividade2 = new ItemAvaliacaoVO();
//        atividade2.setCodigoAtividade("2");
//        atividade2.setHas("08");
//        ItemAvaliacaoVO atividade3 = new ItemAvaliacaoVO();
//        atividade3.setCodigoAtividade("3");
//        atividade3.setHas("09");
//        listaAtividadesAv2.add(atividade2);
//        listaAtividadesAv2.add(atividade3);
//        av2.setListaAtividades(listaAtividadesAv2);
//        listaAvaliacoes.add(av2);
        
        for (int i = 0; i < 10000; i++) {
            AvaliacaoProfessorVO av3 = new AvaliacaoProfessorVO();
            ProfessorVO p3 = new ProfessorVO();
            p3.setIdProfessor(i);
            p3.setNomeProfessor("Nome"+i);
            av3.setProfessor(p3);
            List<ItemAvaliacaoVO> listaAtividadesAv3 = new ArrayList<ItemAvaliacaoVO>();
            for (int j = 0; j < 50; j++) {
                ItemAvaliacaoVO atividade4 = new ItemAvaliacaoVO();
                atividade4.setIdAtividade(i+j+3);
                ItemAvaliacaoVO atividade5 = new ItemAvaliacaoVO();
                atividade5.setIdAtividade(i+j);
                atividade5.setHas("20");
                listaAtividadesAv3.add(atividade4);
                listaAtividadesAv3.add(atividade5); 
                av3.setListaAtividades(listaAtividadesAv3);
            }

            listaAvaliacoes.add(av3);
        }

        avaliacao.setListaAvaliacoes(listaAvaliacoes);

        Gson gson = new Gson();

        String json = gson.toJson(avaliacao);

//        File f = new File("C:\\Users\\Bruno\\Desktop\\test.txt");
        
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("testeJson2.txt", "UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeradorJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GeradorJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.println(json);
        writer.close();
        
        System.out.println("Fim!");
    }
}
