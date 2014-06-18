package com.ufg.avaliacaoprofessores;

import com.ufg.avaliacaoprofessores.vo.ProfessorVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoProfessorVO;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import com.ufg.avaliacaoprofessores.vo.AtividadeVO;
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
        List<AtividadeVO> listaAtividadesAv1 = new ArrayList<AtividadeVO>();
        AtividadeVO atividade1 = new AtividadeVO();
        atividade1.setIdAtividade(1l);
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
        List<AtividadeVO> listaAtividadesAv2 = new ArrayList<AtividadeVO>();
        AtividadeVO atividade2 = new AtividadeVO();
        atividade2.setIdAtividade(2l);
        atividade2.setInformacaoExtra("08");
        AtividadeVO atividade3 = new AtividadeVO();
        atividade3.setIdAtividade(3l);
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
