/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ufg.avaliacaoprofessores.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufg.avaliacaoprofessores.vo.AvaliacaoGeralVO;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Bruno
 */
public class AvaliacaoBusiness {

    public void consomeJson(File arquivo) throws UnsupportedEncodingException {
        AvaliacaoGeralVO avaliacao = carregaAvaliacao(arquivo);
        //fazer reflexao dessas infos pros beans do projeto
        //itim lindo
        
    }

    private AvaliacaoGeralVO carregaAvaliacao(File arquivo) throws UnsupportedEncodingException {
        Reader reader = new InputStreamReader(AvaliacaoBusiness.class.getResourceAsStream("/exemploAvaliacao.json"), "UTF-8");
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(reader, AvaliacaoGeralVO.class);
    }
}
