package com.ufg.avaliacaoprofessores.util;

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
        
        for (int i = 0; i < 10000; i++) {
            int k = i + 1;
            AvaliacaoProfessorVO av1 = new AvaliacaoProfessorVO();
            ProfessorVO prof1 = new ProfessorVO();
            prof1.setIdProfessor(k);
            prof1.setNomeProfessor("Nome"+k);
            av1.setProfessor(prof1);
            List<ItemAvaliacaoVO> listaAtividadesAv = new ArrayList<ItemAvaliacaoVO>();
            for (int j = 0; j < 50; j++) {
                ItemAvaliacaoVO atividade4 = new ItemAvaliacaoVO();
                int idAtividade = (int)(Math.random() * ((100 - 1) + 1));
                atividade4.setIdAtividade(idAtividade);
                if(idAtividade <= 4 && idAtividade > 0){
                    atividade4.setHas("20");
                }
                listaAtividadesAv.add(atividade4);
                av1.setListaAtividades(listaAtividadesAv);
            }

            listaAvaliacoes.add(av1);
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
