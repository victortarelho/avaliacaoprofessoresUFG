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
        
        insereAtividade("Aulas presenciais na graduação*", "1", 10, graduacao, atividadeDAO);
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

         Atividade ativIV11 = new Atividade("Reitor ou Vice-Reitor ou Pró-Reitor", "1", 14, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV11);
        
         Atividade ativIV12 = new Atividade("Chefe de Gabinete", "2", 10, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV12);
        
         Atividade ativIV13 = new Atividade("Coordenador ou assessor vinculado à Reitoria", "3", 10, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV13);
        
         Atividade ativIV14 = new Atividade("Diretor de Unidade Acadêmica, de Unidade Acadêmica Especial ou do CEPAE", "4", 10, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV14);
        
         Atividade ativIV15 = new Atividade("Diretor de Campus do interior", "5", 12, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV15);
        
         Atividade ativIV16 = new Atividade("Vice-diretor de Campus do interior", "6", 12, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV16);
        
         Atividade ativIV17 = new Atividade("Diretor Geral do Hospital das Clínicas", "7", 10, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV17);
        
         Atividade ativIV18 = new Atividade("Coordenador ou assessor vinculado às Pró-Reitorias ou à Direção dos Campus do Interior", "8", 8, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV18);
        
         Atividade ativIV19 = new Atividade("Coordenador de Programa de Pós-Graduação stricto sensu", "9", 8, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV19);
        
         Atividade ativIV110 = new Atividade("Coordenador de Curso de Ensino Básico ou de Graduação", "10", 8, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV110);
        
         Atividade ativIV111 = new Atividade("Vice-diretor de Unidade Acadêmica ou Unidade Acadêmica Especial ou do CEPAE", "11", 8, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV111);
        
         Atividade ativIV112 = new Atividade("Diretor do Hospital Veterinário", "12", 8, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV112);
        
         Atividade ativIV113 = new Atividade("Diretor de Órgão da Administração (CERCOMP, CGA, CEGRAF, CIAR, DDRH, CS, SIASS, Museu, Rádio, Biblioteca etc.)", "13", 8, direcaoEFuncaoGratificada);
        atividadeDAO.salvar(ativIV113);
        
        TipoAtividade atividadesAdministrativas = new TipoAtividade("Atividades Administrativas", "IV-2");
        atividadesAdministrativas.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);

         Atividade ativIV21 = new Atividade("Coordenador de projeto institucional com financiamento ou de contratos e convênio com plano de trabalho aprovado", "1", 5, atividadesAdministrativas);
        atividadeDAO.salvar(ativIV21);
        
         Atividade ativIV22 = new Atividade("Coordenador de curso de especialização, residência médica ou residência multiprofissional em saúde (total máximo a ser considerado neste item são 10 pontos)", "2", 10, atividadesAdministrativas);
        atividadeDAO.salvar(ativIV22);
        
         Atividade ativIV23 = new Atividade("Membro representante de classe da carreira docente no CONSUNI", "3", 10, atividadesAdministrativas);
        atividadeDAO.salvar(ativIV23);
        
         Atividade ativIV24 = new Atividade("Membro do Conselho de Curadores ou do Plenário do CEPEC ou de Conselho de Fundações", "4", 10, atividadesAdministrativas);
        atividadeDAO.salvar(ativIV24);
        
         Atividade ativIV25 = new Atividade("Atividades acadêmicas e administrativas designadas por portaria do Reitor, Pró-Reitor ou Diretor de Unidade Acadêmica com carga horária >=150 horas", "5", 10, atividadesAdministrativas);
        atividadeDAO.salvar(ativIV25);
        
        TipoAtividade outrasAtividadesAdministrativas = new TipoAtividade("Outras Atividades Administrativas", "IV-3");
        outrasAtividadesAdministrativas.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);

         Atividade ativIV31 = new Atividade("Presidente da CPPD", "1", 7, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV31);
        
         Atividade ativIV32 = new Atividade("Presidente da Comissão de Avaliação Institucional ou da Comissão Própria de Avaliação", "2", 5, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV32);
        
         Atividade ativIV33 = new Atividade("Membros da Coordenação Permanente do Centro de Seleção", "3", 5, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV33);
        
         Atividade ativIV34 = new Atividade("Diretores do HC", "4", 5, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV34);
        
         Atividade ativIV35 = new Atividade("Presidente do Comitê de Ética em Pesquisa da UFG e do HC/UFG", "5", 5, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV35);
        
         Atividade ativIV36 = new Atividade("Membros da CPPD ou da Comissão de Avaliação Institucional ou da Comissão Própria de Avaliação ou da CAD", "6", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV36);
        
         Atividade ativIV37 = new Atividade("Coordenador de Pesquisa ou de Ensino ou de Extensão ou de Estágio das Unidades Acadêmicas", "7", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV37);
        
         Atividade ativIV38 = new Atividade("Chefe de Departamento", "8", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV38);
        
         Atividade ativIV39 = new Atividade("Chefe do Pronto Socorro ou da Maternidade ou do CEROF do Hospital das Clínicas da UFG", "9", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV39);
        
         Atividade ativIV310 = new Atividade("Coordenador das Atividades de Interação com a Sociedade", "10", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV310);
        
         Atividade ativIV311 = new Atividade("Coordenador das Atividades de Pesquisa e de Pós–Graduação lato sensu", "11", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV311);
        
         Atividade ativIV312 = new Atividade("Membros do Comitê de Ética da UFG e do HC/UFG", "12", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV312);
        
         Atividade ativIV313 = new Atividade("Membros do Comitê Interno e Externo do PIBIC", "13", 3, outrasAtividadesAdministrativas);
        atividadeDAO.salvar(ativIV313);
        
        TipoAtividade atividadesDeRepresentacaoForaDaUFG = new TipoAtividade("Atividades de Representação Fora da UFG", "IV-4");
        atividadesDeRepresentacaoForaDaUFG.setTipoAtividadePai(atividadesAdministrativasEDeRepresentacao);
       
        Atividade ativIV41 = new Atividade("Representante titular em conselho de classe profissional com carga horária igual ou superior a 150 horas", "1", 10, atividadesDeRepresentacaoForaDaUFG);
        atividadeDAO.salvar(ativIV41);
        
        Atividade ativIV42 = new Atividade("Presidente do Sindicato de Docentes da UFG", "2", 10, atividadesDeRepresentacaoForaDaUFG);
        atividadeDAO.salvar(ativIV42);
        
        Atividade ativIV43 = new Atividade("Diretor do Sindicato de Docentes da UFG", "3", 3, atividadesDeRepresentacaoForaDaUFG);
        atividadeDAO.salvar(ativIV43);
        
        Atividade ativIV44 = new Atividade("Representante sindical com carga horária igual ou superior a 150 horas", "4", 10, atividadesDeRepresentacaoForaDaUFG);
        atividadeDAO.salvar(ativIV44);
        
        Atividade ativIV45 = new Atividade("Representante em entidade científica, artística e cultural com carga horária igual ou superior a 150 horas", "5", 10, atividadesDeRepresentacaoForaDaUFG);
        atividadeDAO.salvar(ativIV45);
        
        Atividade ativIV46 = new Atividade("Representante em comissão de órgão governamental com carga horária igual ou superior a 150 horas", "6", 10, atividadesDeRepresentacaoForaDaUFG);
        atividadeDAO.salvar(ativIV46);
        
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
    
    public static void insereAtividade(String nome, String codigo, float pontuacao, TipoAtividade tipo, AtividadeDAO atividadeDAO){
        Atividade ativ = new Atividade(nome,codigo, pontuacao, tipo);
        atividadeDAO.salvar(ativ);
    }
}
