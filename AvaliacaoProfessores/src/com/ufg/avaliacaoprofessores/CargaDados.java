/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.dao.AtividadeDAO;
import com.ufg.avaliacaoprofessores.dao.TipoAtividadeDAO;

/**
 *
 * @author italogustavomirandamelo
 */
public class CargaDados {

    public static void main(String[] args){
        insereDadosTeste();
    }
    public static void insereDadosTeste() {
        GerarTabelas.geraTabelas();
        
        TipoAtividadeDAO tipoAtividadeDAO = new TipoAtividadeDAO();
        AtividadeDAO atividadeDAO = new AtividadeDAO();
        
        insereTipoAtividadeEnsino(tipoAtividadeDAO, atividadeDAO);
        insereTipoProducaoIntelectual(tipoAtividadeDAO, atividadeDAO);
        insereTipoAtividadePesquisaExtensao(tipoAtividadeDAO, atividadeDAO);
        insereTipoAtividadesAdministrativasEDeRepresentacao(tipoAtividadeDAO, atividadeDAO);
        insereTipoOutrasAtividades(tipoAtividadeDAO, atividadeDAO);
    }

    public static void insereTipoAtividadeEnsino(TipoAtividadeDAO tipoAtividadeDAO, AtividadeDAO atividadeDAO) {
        TipoAtividade atividadeEnsino = new TipoAtividade("ATIVIDADES DE ENSINO", "I");
        tipoAtividadeDAO.salvar(atividadeEnsino);
        
        TipoAtividade graduacao = new TipoAtividade("Graduação", "I-1");
        graduacao.setTipoAtividadePai(atividadeEnsino);
        tipoAtividadeDAO.salvar(graduacao);
                
        TipoAtividade posGraduacaoStrictu = new TipoAtividade("Pós-Graduação stricto e lato sensu ", "I-2");
        posGraduacaoStrictu.setTipoAtividadePai(atividadeEnsino);
        tipoAtividadeDAO.salvar(posGraduacaoStrictu);
        
        Atividade ativI11 = new Atividade("Aulas presenciais na graduação*", "1", 10, graduacao);
        atividadeDAO.salvar(ativI11);
        
    }
    
    public static void insereTipoProducaoIntelectual(TipoAtividadeDAO tipoAtividadeDAO, AtividadeDAO atividadeDAO) {
        TipoAtividade producaoIntelectual = new TipoAtividade("PRODUÇÃO INTELECTUAL", "II");

        TipoAtividade producacaoCientifica = new TipoAtividade("Produção Científica", "II-1");
        producacaoCientifica.setTipoAtividadePai(producaoIntelectual);

        TipoAtividade producaoArtistica = new TipoAtividade("Produção Artística e Cultural", "II-2");
        producaoArtistica.setTipoAtividadePai(producaoIntelectual);

        TipoAtividade producaoTecnica = new TipoAtividade("Produção Técnica e Tecnológica ", "II-3");
        producaoTecnica.setTipoAtividadePai(producaoIntelectual);

        TipoAtividade outroTipoProducao = new TipoAtividade("Outro Tipo de Produção ", "II-4");
        outroTipoProducao.setTipoAtividadePai(producaoIntelectual);
    }

    public static void insereTipoAtividadePesquisaExtensao(TipoAtividadeDAO tipoAtividadeDAO, AtividadeDAO atividadeDAO) {
        TipoAtividade atividadePesquisaExtensao = new TipoAtividade("ATIVIDADES DE PESQUISA E EXTENSÃO", "III");

        TipoAtividade atividadeDeCoordenacaoDePesquisa = new TipoAtividade("Atividades de Coordenação de Pesquisa", "III-1");
        atividadeDeCoordenacaoDePesquisa.setTipoAtividadePai(atividadePesquisaExtensao);

        TipoAtividade atividadeDeExtensao = new TipoAtividade("Atividades de Extensão", "III-2");
        atividadeDeExtensao.setTipoAtividadePai(atividadePesquisaExtensao);
    }

    public static void insereTipoAtividadesAdministrativasEDeRepresentacao(TipoAtividadeDAO tipoAtividadeDAO, AtividadeDAO atividadeDAO) {
        TipoAtividade atividadesAdministrativasEDeRepresentacao = new TipoAtividade("ATIVIDADES ADMINISTRATIVAS E DE REPRESENTAÇÃO", "IV");

        TipoAtividade direcaoEFuncaoGratificada = new TipoAtividade("Direção e Função Gratificada", "IV-1");
        direcaoEFuncaoGratificada.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);

        TipoAtividade atividadesAdministrativas = new TipoAtividade("Atividades Administrativas", "IV-2");
        atividadesAdministrativas.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);

        TipoAtividade outrasAtividadesAdministrativas = new TipoAtividade("Outras Atividades Administrativas", "IV-3");
        outrasAtividadesAdministrativas.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);

        TipoAtividade atividadesDeRepresentacaoForaDaUFG = new TipoAtividade("Atividades de Representação Fora da UFG", "IV-4");
        atividadesDeRepresentacaoForaDaUFG.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);
    }

    public static void insereTipoOutrasAtividades(TipoAtividadeDAO tipoAtividadeDAO, AtividadeDAO atividadeDAO) {
        TipoAtividade outrasAtividades = new TipoAtividade("OUTRAS ATIVIDADES", "V");

        TipoAtividade atividadesAcademicasOrientacao = new TipoAtividade("Atividades Acadêmicas - Orientação", "V-1");
        atividadesAcademicasOrientacao.setTipoAtividadePai(outrasAtividades);

        TipoAtividade atividadesAcademicasBancasECursos = new TipoAtividade("Atividades Acadêmicas – Bancas e Cursos ", "V-2");
        atividadesAcademicasBancasECursos.setTipoAtividadePai(outrasAtividades);

        TipoAtividade atividadesDeAprendizadoEAperfeicoamento = new TipoAtividade("Atividades de Aprendizado e Aperfeiçoamento", "V-3");
        atividadesDeAprendizadoEAperfeicoamento.setTipoAtividadePai(outrasAtividades);
    }
}
