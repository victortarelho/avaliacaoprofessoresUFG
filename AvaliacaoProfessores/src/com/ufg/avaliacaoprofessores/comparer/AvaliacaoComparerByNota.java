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
public class AvaliacaoComparerByNota implements Comparator<AvaliacaoDocente> {

    @Override
    public int compare(AvaliacaoDocente x, AvaliacaoDocente y) {

        Float avaliacao1 = x.getPontuacaoTotal();
        Float avaliacao2 = y.getPontuacaoTotal();

        //ascending order
        return avaliacao1.compareTo(avaliacao2);

    }

}
