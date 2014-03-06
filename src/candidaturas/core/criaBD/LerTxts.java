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
		// ainda falta:
		// Criar ENUM para mapear campos do banco com indice da lista "campos"
		// ver http://www.devmedia.com.br/tipos-enum-no-java/25729
		
		String nomeTXT = "/home/u13/Projetos/DadosTXT/PrestacaoFinal/candidato/SP/ReceitasCandidatos.txt";
		String campos[];
		FileReader arq;
		BufferedReader lerArq;

		/*
		 * Descomentar apos conseguir pegar os valores do txt corretamente
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("candidaturasdb");
		 * EntityManager em = factory.createEntityManager(); ReceitasCandidatos
		 * receitas = new ReceitasCandidatos();
		 */

		try {
			int i = 0;
			arq = new FileReader(nomeTXT);
			lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine(); // le primeira linha
			System.out.println(linha);

			while (linha != null) {
				linha = lerArq.readLine();
				
				//debug
				//System.out.println(linha);
				
				if (linha != null) {		//if colocado pois o readline (que avanca a posicao do txt) ta dentro do while 
					linha.replace("\"", "");
					linha.replace(" ", "_");

					campos = linha.split(";");
					System.out.println(i + "\n");
				}
				
				//debug
				/*i++;
				System.out.println(campos[0] + "\n");
				System.out.println(campos[1] + "\n");*/
				
			}
			
			lerArq.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		receitasCandidatosTxt2BD();

	}

	public enum TXTReceitasCandidatos {

	}

}
