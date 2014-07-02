/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.comparer;

import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import java.util.Comparator;

/**
 *
 * @author Bruno
 */
public class AvaliacaoComparerByNomeDocente implements Comparator<AvaliacaoDocente> {

    @Override
    public int compare(AvaliacaoDocente x, AvaliacaoDocente y) {

        String avaliacao1 = x.getDocente().getNome();
        String avaliacao2 = y.getDocente().getNome();

        //ascending order
        return avaliacao1.compareToIgnoreCase(avaliacao2);

    }

}
