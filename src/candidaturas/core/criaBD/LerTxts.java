package candidaturas.core.criaBD;

import java.io.BufferedReader;
import java.lang.reflect.Method;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sun.org.mozilla.javascript.ast.TryStatement;
import entities.ReceitasCandidatos;

public class LerTxts {
	


	public enum MapCamposReceitasCandidatos {	
		Data_e_hora(0), Sequencial_Candidato(1), UF(2), Numero_UE(3), Municipio(4), Sigla_Partido(5), 
		Numero_candidato(6), Cargo(7), Nome_candidato(8), CPF_do_candidato(9), Numero_Recibo_Eleitoral(10),
		Numero_do_documento(11), CPF_CNPJ_do_doador(12), Nome_do_doador(13), Nome_receita_doador(14), 
		Sigla_UE_doador(15), Numero_partido_doador(16), Numero_candidato_doador(17), Cod_setor_economico_doador(18), 
		Setor_economico_doador(19), Data_da_receita(20), Valor_receita(21), Tipo_receita(22), Fonte_recurso(23), 
		Especie_recurso(24), Descricao_da_receita(25);
		
		private final int valor;
		MapCamposReceitasCandidatos(int valorCampo){
			valor = valorCampo;
		}
		public int getValor(){
			return valor;
		}
	}
	
	
	public static void receitasCandidatosTxt2BD() {
		// ainda falta:
		// PENSAR EM USAR UM SWITCH CASE DENTRO DO FOR E MAPEAR OS CAMPOS NO SWITCH CASE - MUDAR DA ABORDAGEM DO ENBUM
		// ver http://www.devmedia.com.br/tipos-enum-no-java/25729
		
		MapCamposReceitasCandidatos camposMapeados = null;	
		String nomeTXT = "/home/u13/Projetos/DadosTXT/PrestacaoFinal/candidato/SP/ReceitasCandidatos.txt";
		String campos[];
		String nomeMetodo;
		FileReader arq;
		BufferedReader lerArq;

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("candidaturasdb");
		EntityManager em = factory.createEntityManager(); 
		ReceitasCandidatos receitas = new ReceitasCandidatos();

		try {

			
			int i = 0;
			arq = new FileReader(nomeTXT);
			lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine(); // le primeira linha
			
			//System.out.println(linha);

			while (linha != null) {
				linha = lerArq.readLine();

				if (linha != null) {		//if colocado pois o readline (que avanca a posicao do txt) ta dentro do while. Na ultima posicao da merda
					linha.replace("\"", "");
					linha.replace(" ", "_");
					campos = linha.split(";");
					//for (int j = 0; j < campos.length; j++){
					for (int j = 0; j < 5; j++){
						nomeMetodo = "set" + camposMapeados.values()[j].toString();
											
						
						if(j < 5){
						
							Class argsType[] = new Class[1];
							argsType[0] = String.class;						
							Class classeReceitasCandidatos = Class.forName("ReceitasCandidatos");
							Method metodo = classeReceitasCandidatos.getMethod(nomeMetodo, argsType);
							
							
						//	problema para passar arg string para funcao.....
							Object argList = new String();
							argList = new String(campos[j]);
							
							metodo.invoke(receitas, argList);
							
							//System.out.println(nomeMetodo);	
							em.getTransaction().begin();
							em.persist(receitas);
							em.getTransaction().commit();
						}
					}
				}
			}

			lerArq.close();
		
		} catch (Throwable e){
			System.err.println(e.getMessage());
			System.out.println("erro");
		}
		
		System.out.println("Terminou");
		
	}

	public static void main(String[] args) {
		receitasCandidatosTxt2BD();

	}

	public enum TXTReceitasCandidatos {

	}

}
