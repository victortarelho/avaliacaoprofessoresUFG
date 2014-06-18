
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
public class Main {
    
    public static void main(String[] args){
        
        //gerar json com gson
        AvaliacaoGeral avaliacao = new AvaliacaoGeral();
        
        List<AvaliacaoProfessor> listaAvaliacoes = new ArrayList<AvaliacaoProfessor>();
        
        //avaliacao 1
        AvaliacaoProfessor av1 = new AvaliacaoProfessor();
        Professor p1 = new Professor();
        p1.setIdProfessor(1);
        p1.setNomeProfessor("Nome1");
        av1.setProfessor(p1);
        List<Atividade> listaAtividadesAv1 = new ArrayList<Atividade>();
        Atividade atividade1 = new Atividade();
        atividade1.setIdAtividadeEMultiplicador("1-10");
        listaAtividadesAv1.add(atividade1);
        av1.setListaAtividades(listaAtividadesAv1);
        listaAvaliacoes.add(av1);
        
        //avaliacao 2
        AvaliacaoProfessor av2 = new AvaliacaoProfessor();
        Professor p2 = new Professor();
        p2.setIdProfessor(2);
        p2.setNomeProfessor("Nome2");
        av2.setProfessor(p2);
        List<Atividade> listaAtividadesAv2 = new ArrayList<Atividade>();
        Atividade atividade2 = new Atividade();
        atividade2.setIdAtividadeEMultiplicador("2-08");
        listaAtividadesAv2.add(atividade2);
        av2.setListaAtividades(listaAtividadesAv2);
        listaAvaliacoes.add(av2);

        avaliacao.setListaAvaliacoes(listaAvaliacoes);
        
        Gson gson = new Gson();
        
        String json = gson.toJson(avaliacao);
 
//	try {
//		//write converted json data to a file named "file.json"
//		FileWriter writer = new FileWriter("C:\\Users\\Bruno\\Desktop");
//		writer.write(json);
//		writer.close();
// 
//	} catch (Exception e) {
//		e.printStackTrace();
//	} 
 
	System.out.println(json);
        
    }

}
