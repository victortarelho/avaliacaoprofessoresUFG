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

        TipoAtividade producaoCientifica = new TipoAtividade("Produção Científica", "II-1");
        producaoCientifica.setTipoAtividadePai(producaoIntelectual);
        
        insereAtividade("Artigo completo ou texto literário publicado em periódico Com classificação no Qualis/CAPES ","1.1", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Artigo completo ou texto literário publicado em periódico Não sujeito à classificação no Qualis/CAPES ","1.2", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo de artigo em periódicos especializados nacional ou internacional com corpo editorial ","2", 5, producaoCientifica, atividadeDAO);
        insereAtividade("Artigos ou textos literários em repositórios de publicação eletrônica ligados a editoras ou universidades ","3", 5, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo expandido publicado em anais de congresso Internacional ","4.1", 8, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo expandido publicado em anais de congresso Nacional ","4.2", 6, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo expandido publicado em anais de congresso Regional ou Local ","4.3", 4, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo simples publicado em anais de congresso Internacional ","5.1", 4, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo simples publicado em anais de congresso Nacional ","5.2", 3, producaoCientifica, atividadeDAO);
        insereAtividade("Resumo simples publicado em anais de congresso Regional ou Local ","5.3", 2, producaoCientifica, atividadeDAO);
        insereAtividade("Trabalho completo publicado em anais de congresso cientifico ","6", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Editor ou Coordenador editorial de livro publicado com selo de editora que possua corpo editorial ","7", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Livro publicado com selo de editora que possua corpo editorial ","8", 40, producaoCientifica, atividadeDAO);
        insereAtividade("Livro publicado com selo de editora que não possua corpo editorial ","9", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Capítulo de livro publicado com selo de editora que possua corpo editorial ","10", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Edição ou organização de livro (coletânea) publicado com selo de editora que possua corpo editorial ","11", 12, producaoCientifica, atividadeDAO);
        insereAtividade("Capítulo traduzido de livro publicado com selo de editora que possua corpo editorial ","12", 5, producaoCientifica, atividadeDAO);
        insereAtividade("Tradução ou revisão científica de livro traduzido e publicado com selo de editora que possua corpo editorial ","13", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Resenhas, prefácios ou verbetes ","14", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Livro didático desenvolvido para projetos institucionais/governamentais ","15", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Editor de periódicos especializados indexados com corpo editorial ","16", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Editor de jornais ou revistas com distribuição Local ou regional ","17.1", 15, producaoCientifica, atividadeDAO);
        insereAtividade("Editor de jornais ou revistas com distribuição Nacional ","17.2", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Editor de jornais ou revistas com distribuição Internacional ","17.3", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Dissertação de Mestrado defendida de aprovada (sendo o docente o autor da dissertação) ","18", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Tese de Doutorado defendida e aprovada (sendo o docente o autor da tese) ","19", 15, producaoCientifica, atividadeDAO);


        TipoAtividade producaoArtistica = new TipoAtividade("Produção Artística e Cultural", "II-2");
        producaoArtistica.setTipoAtividadePai(producaoIntelectual);
        
        insereAtividade("Criação, produção e direção de filmes, vídeos, discos, audiovisuais, coreografias, peças teatrais, óperas ou musicais, ou musicais apresentados em eventos Locais ou regionais ","1.1", 10, producaoArtistica, atividadeDAO);
        insereAtividade("Criação, produção e direção de filmes, vídeos, discos, audiovisuais, coreografias, peças teatrais, óperas ou musicais, ou musicais apresentados em eventos Nacionais ","1.2", 15, producaoArtistica, atividadeDAO);
        insereAtividade("Criação, produção e direção de filmes, vídeos, discos, audiovisuais, coreografias, peças teatrais, óperas ou musicais, ou musicais apresentados em eventos Internacionais ","1.3", 20, producaoArtistica, atividadeDAO);
        insereAtividade("Criação e produção do projeto gráfico de livros: concepção gráfica (mancha gráfica, diagramação, escolha de fonte) ","2", 10, producaoArtistica, atividadeDAO);
        insereAtividade("Design (gráfico, de luz, de figurino e formas animadas, cenográfico e similares) ","3", 5, producaoArtistica, atividadeDAO);
        insereAtividade("Design de impressos por peça ","4", 1, producaoArtistica, atividadeDAO);
        insereAtividade("Design de interfaces digitais ","5", 10, producaoArtistica, atividadeDAO);
        insereAtividade("Design de interfaces digitais ou produtos com inovação tecnológica ","6", 20, producaoArtistica, atividadeDAO);
        insereAtividade("Exposições e apresentações artísticas locais ou regionais Participação individual, camerista, solista ou ator principal ","5.1", 16, producaoArtistica, atividadeDAO);
        insereAtividade("Exposições e apresentações artísticas locais ou regionais Participação coletiva ou coadjuvante ","5.2", 5, producaoArtistica, atividadeDAO);
        insereAtividade("Exposições e apresentações artísticas nacionais Participação individual, camerista, solista ou ator principal ","6.1", 20, producaoArtistica, atividadeDAO);
        insereAtividade("Exposições e apresentações artísticas nacionais Participação coletiva ou coadjuvante ","6.2", 10, producaoArtistica, atividadeDAO);
        insereAtividade("Exposições e apresentações artísticas internacionais Participação individual, camerista, solista ou ator principal ","7.1", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Exposições e apresentações artísticas internacionais Participação coletiva ou coadjuvante ","7.2", 15, producaoCientifica, atividadeDAO);
        insereAtividade("Composições musicais Editadas ","8.1", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Composições musicais Publicadas em revistas científicas ","8.2", 20, producaoCientifica, atividadeDAO);
        insereAtividade("Composições musicais Gravadas ","8.3", 15, producaoCientifica, atividadeDAO);
        insereAtividade("Composições musicais Executadas em apresentações públicas ","8.4", 15, producaoCientifica, atividadeDAO);
        insereAtividade("Produção artística, arquitetônica ou de design premiada em evento Local ou regional ","9.1", 5, producaoCientifica, atividadeDAO);
        insereAtividade("Produção artística, arquitetônica ou de design premiada em evento Nacional ","9.2", 10, producaoCientifica, atividadeDAO);
        insereAtividade("Produção artística, arquitetônica ou de design premiada em evento Internacional ","9.3", 15, producaoCientifica, atividadeDAO);
        insereAtividade("Arranjos musicais (canto, coral e orquestral) ","10", 5, producaoCientifica, atividadeDAO);
        insereAtividade("Apresentação artística ou cultural em rádio ou TV ","11", 5, producaoCientifica, atividadeDAO);
        insereAtividade("Sonoplastia (cinema, música, rádio, televisão, teatro) ","12", 3, producaoCientifica, atividadeDAO);

        TipoAtividade producaoTecnica = new TipoAtividade("Produção Técnica e Tecnológica ", "II-3");
        producaoTecnica.setTipoAtividadePai(producaoIntelectual);
        
        insereAtividade("Desenvolvimento de programa de computador (software) com registro no INPI ou com ampla disponibilização em ambientes de software livre ","1", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento de software com divulgação em periódicos indexados e com corpo editorial ou em anais de congresso científico ","2", 10, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento de software para uso institucional ","3", 5, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento e registro no INPI de topografia de circuito integrado ","4", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento de produto, processo ou técnica com registro de patente no INPI ou modelo de utilidade ","5", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento e registro no INPI de desenho industrial ","6", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento e registro no INPI de processo de indicação geográfica ","7", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento e registro no INPI de marcas ","8", 5, producaoTecnica, atividadeDAO);
        insereAtividade("Participação em comitê editorial de periódicos especializados indexados e de editoras universitárias ","9", 10, producaoTecnica, atividadeDAO);
        insereAtividade("Parecer de consultoria ad hoc em comitês de avaliação de concursos e editais de publicação de livros de editoras com corpo editorial ","10", 3, producaoTecnica, atividadeDAO);
        insereAtividade("Parecer de consultoria ad hoc para periódicos especializados com corpo editorial ou para instituições de fomento à pesquisa ou para livros de editoras com corpo editorial ","11", 3, producaoTecnica, atividadeDAO);
        insereAtividade("Projeto, parecer ou relatório técnico realizado em consultoria ou assessoria oficializada por convite, convênio, contrato ou designação Parecer com anotação de responsabilidade técnica (ART) ou registro de responsabilidade técnica (RRT) ","12.1", 10, producaoTecnica, atividadeDAO);
        insereAtividade("Projeto, parecer ou relatório técnico realizado em consultoria ou assessoria oficializada por convite, convênio, contrato ou designação Parecer sem anotação de responsabilidade técnica (ART) ou registro de responsabilidade técnica (RRT) ","12.2", 5, producaoTecnica, atividadeDAO);
        insereAtividade("Projeto, parecer ou relatório técnico realizado em consultoria ou assessoria oficializada por convite, convênio, contrato ou designação Projeto ou Relatório Técnico com anotação de responsabilidade técnica (ART) ou registro de responsabilidade técnica (RRT) ","12.3", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Projeto, parecer ou relatório técnico realizado em consultoria ou assessoria oficializada por convite, convênio, contrato ou designação Projeto ou Relatório Técnico sem anotação de responsabilidade técnica (ART) ou registro de responsabilidade técnica (RRT) ","12.4", 10, producaoTecnica, atividadeDAO);
        insereAtividade("Anais, Manuais, catálogos, boletins, com ficha bibliográfica (organizador / redator) ","13", 5, producaoTecnica, atividadeDAO);
        insereAtividade("Produção e publicação de mapas, cartas ou similares ","14", 10, producaoTecnica, atividadeDAO);
        insereAtividade("Desenvolvimento de maquete ","15", 5, producaoTecnica, atividadeDAO);
        insereAtividade("Manutenção de obra artística Restauração de obra artística ","16.1", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Manutenção de obra artística Conservação de obra artística ","16.2", 10, producaoTecnica, atividadeDAO);
        insereAtividade("Curadoria de exposições ","17", 5, producaoTecnica, atividadeDAO);
        insereAtividade("Produção de cinema, vídeo, rádio, TV ou mídias digitais Editor ","18.1", 20, producaoTecnica, atividadeDAO);
        insereAtividade("Produção de cinema, vídeo, rádio, TV ou mídias digitais Participante ","18.2", 3, producaoTecnica, atividadeDAO);

        TipoAtividade outroTipoProducao = new TipoAtividade("Outro Tipo de Produção ", "II-4");
        outroTipoProducao.setTipoAtividadePai(producaoIntelectual);
        
        insereAtividade("Artigos de opinião veiculados em jornais e revistas (eletrônico ou impresso) ","1", 1, outroTipoProducao, atividadeDAO);
        insereAtividade("Texto ou material didático para uso institucional (não fracionados e com ampla divulgação) ","2", 2, outroTipoProducao, atividadeDAO);
        insereAtividade("Artigos de divulgação científica, tecnológica e artística veiculados em jornais e revistas (eletrônico ou impresso) ","3", 3, outroTipoProducao, atividadeDAO);
        insereAtividade("Apresentação oral de trabalho publicado em anais de congresso científico ","4", 3, outroTipoProducao, atividadeDAO);
        insereAtividade("Apresentação em painel de trabalho publicado em anais de congresso científico ","5", 1, outroTipoProducao, atividadeDAO);
        insereAtividade("Trabalho premiado em evento científico nacional ou internacional ","6", 5, outroTipoProducao, atividadeDAO);
        insereAtividade("Tese, dissertação e trabalho de iniciação científica premiados por instituições de fomento (sendo o docente o autor ou orientador do produto) ","7", 8, outroTipoProducao, atividadeDAO);
    }

    public static void insereTipoAtividadePesquisaExtensao(TipoAtividadeDAO tipoAtividadeDAO, AtividadeDAO atividadeDAO) {
        TipoAtividade atividadePesquisaExtensao = new TipoAtividade("ATIVIDADES DE PESQUISA E EXTENSÃO", "III");

        TipoAtividade atividadeDeCoordenacaoDePesquisa = new TipoAtividade("Atividades de Coordenação de Pesquisa", "III-1");
        atividadeDeCoordenacaoDePesquisa.setTipoAtividadePai(atividadePesquisaExtensao);
        
        insereAtividade("Coordenador de projeto conjuntos de pesquisa e cooperação científica (tipo PRODOC, PROCAD, PNPD, entre outros) e de cursos MINTER e DINTER aprovados por órgãos oficiais de fomento ","1", 10, atividadeDeCoordenacaoDePesquisa, atividadeDAO);
        insereAtividade("Coordenador de projeto de pesquisa aprovado com comprovação de financiamento (exceto bolsas) ","2", 10, atividadeDeCoordenacaoDePesquisa, atividadeDAO);
        insereAtividade("Coordenador de projeto de pesquisa aprovado sem financiamento (total máximo a ser considerado neste item são 10 pontos) ","3", 5, atividadeDeCoordenacaoDePesquisa, atividadeDAO);

        TipoAtividade atividadeDeExtensao = new TipoAtividade("Atividades de Extensão", "III-2");
        atividadeDeExtensao.setTipoAtividadePai(atividadePesquisaExtensao);
        
        insereAtividade("Coordenador de projeto de extensão aprovado com comprovação de financiamento (exceto bolsas) ","1", 10, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Coordenador de projeto ou programa de extensão/cultura cadastrado na PROEC (total máximo a ser considerado neste item são 15 pontos) ","2", 5, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Coordenador de contratos e de convênios de cooperação institucional internacional ","3", 5, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Coordenador de contratos e de convênios de cooperação institucional nacional ","4", 3, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Participante de projeto de extensão/cultura cadastrado na PROEC (total máximo a ser considerado neste item são 15 pontos) ","5", 3, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Curso de extensão ministrado com 20 ou mais horas (total máximo a ser considerado neste item são 15 pontos) ","6", 5, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Curso de extensão ministrado com menos de 20 horas (total máximo a ser considerado neste item são 10 pontos) ","7", 2, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Evento internacional (total máximo a ser considerado neste item são 15 pontos) ","8.1", 5, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Evento nacional (total máximo a ser considerado neste item são 12 pontos) ","8.2", 4, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Evento regional ou local (total máximo a ser considerado neste item são 9 pontos) ","8.3", 3, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Presidente ","9.1", 4, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Comissão organizadora ","8.2", 2, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Presidente ","10.1", 6, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Comissão organizadora ","10.2", 3, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Presidente ","11.1", 8, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Comissão organizadora ","11.2", 4, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Presidente ","12.1", 10, atividadeDeExtensao, atividadeDAO);
        insereAtividade("Comissão organizadora ","12.2", 5, atividadeDeExtensao, atividadeDAO);
        
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
        insereAtividade("Aluno orientado em tese de doutorado defendida e aprovada","1", 20, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno co-orientado em tese de doutorado defendida e aprovada","2", 7, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em tese de doutorado em andamento","3", 10, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno co-orientado em tese de doutorado em andamento","4", 4, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em dissertação de mestrado defendida e aprovada","5", 15, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno co-orientado em dissertação de mestrado defendida e aprovada","6", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em dissertação de mestrado em andamento","7", 8, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno co-orientado em dissertação de mestrado em andamento","8", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em monografia de especialização aprovada (máximo de 24 pontos)","9", 8, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em monografia de especialização em andamento (total máximo a ser considerado neste item são 12 pontos)","10", 4, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em residência médica ou em residência multiprofissional em saúde","11", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em estágio supervisionado","12", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em projeto de final de curso","13", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE orientado em tese de doutorado defendida e aprovada","14", 6, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE co-orientado em tese de doutorado defendida e aprovada","15", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE orientado em tese de doutorado em andamento","16", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE co-orientado em tese de doutorado em andamento","17", 2, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE orientado em dissertação de mestrado defendida e aprovada","18", 4, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE co-orientado em dissertação de mestrado defendida e aprovada","19", 2, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE orientado em dissertação de mestrado em andamento","20", 2, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno de outra IFE co-orientado em dissertação de mestrado em andamento","21", 1, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em programa de iniciação científica (PIBIC/PIVIC/PROLICEN/PICME-OBMEP)","22", 6, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em programa de iniciação científica júnior","23", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em programa especial de treinamento (PET)","24", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado com bolsa de DTI, PIBIT, AT, Jovens Talentos e similares","25", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado com bolsa de licenciatura (PIBID e similares)","26", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado com bolsa extensão/cultura/ensino","27", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em projetos de extensão/cultura/ensino sem bolsa","28", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado com bolsa PROCOM ou similar, vinculada a projeto de pesquisa/extensão/ensino","29", 5, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em programa de monitoria","30", 3, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em atividade não curricular com bolsa","31", 2, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em atividade não curricular sem bolsa","32", 1, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Pesquisador supervisionado em estágio de pós-doutoramento (PRODOC,PNPD, DCR, entre outros)","33", 8, atividadesAcademicasOrientacao, atividadeDAO);
        insereAtividade("Aluno orientado em Prática como Componente Curricular (PCC)","34", 1, atividadesAcademicasOrientacao, atividadeDAO);
        
        TipoAtividade atividadesAcademicasBancasECursos = new TipoAtividade("Atividades Acadêmicas – Bancas e Cursos ", "V-2");
        atividadesAcademicasBancasECursos.setTipoAtividadePai(outrasAtividades);
        insereAtividade("Na instituição","1.1",4,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Em outra instituição","1.2",6,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Membro de banca de concurso para docente substituto","2",2,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Na instituição","3.1",4,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Em outra instituição","3.2",6,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Na instituição","4.1",6,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Em outra instituição","4.2",8,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Na instituição","5.1",3,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Em outra instituição","5.2",4,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Na instituição","6.1",5,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Em outra instituição","6.2",6,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Membro de banca de defesa de monografia, projeto final de curso e outros tipos de bancas (total máximo a ser considerado neste item são 10 pontos)","7",2,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Concursos internacionais","8.1",8,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Concursos nacionais","8.2",6,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Cursos, palestras ou treinamento não curricular ministrados para docentes, funcionários ou alunos da UFG","9",2,atividadesAcademicasBancasECursos,atividadeDAO);
        insereAtividade("Coordenador de projeto institucional de intercâmbio internacional","10",10,atividadesAcademicasBancasECursos,atividadeDAO);
        
        
        TipoAtividade atividadesDeAprendizadoEAperfeicoamento = new TipoAtividade("Atividades de Aprendizado e Aperfeiçoamento", "V-3");
        atividadesDeAprendizadoEAperfeicoamento.setTipoAtividadePai(outrasAtividades);
        insereAtividade("Docente regularmente matriculado em curso de doutorado com relatórios de pós-graduação aprovados (pontuação por mês de curso)","1",12,atividadesDeAprendizadoEAperfeicoamento,atividadeDAO);
        insereAtividade("Estágio Pós-Doutoral ou Estágio Sênior (pontuação por mês de estágio)","2",12,atividadesDeAprendizadoEAperfeicoamento,atividadeDAO);
        insereAtividade("Docente em licença para capacitação (Artigo 87, Lei N.8112) (pontuação por mês de licença)","3",12,atividadesDeAprendizadoEAperfeicoamento,atividadeDAO);
        insereAtividade("Curso de aperfeiçoamento realizado com carga horária superior a 40 horas","4",3,atividadesDeAprendizadoEAperfeicoamento,atividadeDAO);
        insereAtividade("Curso de aperfeiçoamento realizado com carga horária inferior a 40 horas","5",1,atividadesDeAprendizadoEAperfeicoamento,atividadeDAO);
        insereAtividade("Participação em Congressos, Seminários, Encontros, Jornadas etc. (total máximo a ser considerado neste item são 3 pontos)","6",1,atividadesDeAprendizadoEAperfeicoamento,atividadeDAO);

    }
    
    public static void insereAtividade(String nome, String codigo, float pontuacao, TipoAtividade tipo, AtividadeDAO atividadeDAO){
        Atividade ativ = new Atividade(nome,codigo, pontuacao, tipo);
        atividadeDAO.salvar(ativ);
    }
}
