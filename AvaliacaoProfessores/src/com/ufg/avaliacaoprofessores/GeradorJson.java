package com.ufg.avaliacaoprofessores;

import com.ufg.avaliacaoprofessores.vo.ProfessorVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import com.ufg.avaliacaoprofessores.vo.ItemAvaliacaoVO;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

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
        AvaliacaoProfessorVO av1 = new AvaliacaoProfessorVO();
        ProfessorVO p1 = new ProfessorVO();
        p1.setIdProfessor(1);
        p1.setNomeProfessor("Nome1");
        av1.setProfessor(p1);
        List<ItemAvaliacaoVO> listaAtividadesAv1 = new ArrayList<ItemAvaliacaoVO>();
        ItemAvaliacaoVO atividade1 = new ItemAvaliacaoVO();
        atividade1.setCodigoAtividade("1");
        atividade1.setInformacaoExtra("10");
        listaAtividadesAv1.add(atividade1);
        av1.setListaAtividades(listaAtividadesAv1);
        listaAvaliacoes.add(av1);

        //avaliacao 2
        AvaliacaoProfessorVO av2 = new AvaliacaoProfessorVO();
        ProfessorVO p2 = new ProfessorVO();
        p2.setIdProfessor(2);
        p2.setNomeProfessor("Nome2");
        av2.setProfessor(p2);
        List<ItemAvaliacaoVO> listaAtividadesAv2 = new ArrayList<ItemAvaliacaoVO>();
        ItemAvaliacaoVO atividade2 = new ItemAvaliacaoVO();
        atividade2.setCodigoAtividade("2");
        atividade2.setInformacaoExtra("08");
        ItemAvaliacaoVO atividade3 = new ItemAvaliacaoVO();
        atividade3.setCodigoAtividade("3");
        atividade3.setInformacaoExtra("09");
        listaAtividadesAv2.add(atividade2);
        listaAtividadesAv2.add(atividade3);
        av2.setListaAtividades(listaAtividadesAv2);
        listaAvaliacoes.add(av2);

        avaliacao.setListaAvaliacoes(listaAvaliacoes);

        Gson gson = new Gson();

        String json = gson.toJson(avaliacao);

        System.out.println(json);
    }
}
