package candidaturas.core.criaBD;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sun.org.mozilla.javascript.ast.TryStatement;
import entities.ReceitasCandidatos;

public class LerTxts {
	
	public static void receitasCandidatosTxt2BD() {
		String nomeTXT = "/home/u13/Projetos/DadosTXT/PrestacaoFinal/candidato/SP/ReceitasCandidatos.txt";
		
		/* Descomentar apos conseguir pegar os valores do txt corretamente
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("candidaturasdb"); 
		EntityManager em = factory.createEntityManager();
		ReceitasCandidatos receitas = new ReceitasCandidatos();
		*/
		
		try{
		FileReader arq = new FileReader(nomeTXT);
	    BufferedReader lerArq = new BufferedReader(arq);
	    String linha = lerArq.readLine();	//le primeira linha
	    System.out.println(linha);
	  /*  while (linha != null) {
			linha = lerArq.readLine();
			
		}
	    */
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
	
	public static void main(String[] args) {
		receitasCandidatosTxt2BD();

	}
	
	
	public enum TXTReceitasCandidatos {
		
	}
	
	
}
