//<property name="javax.persistence.jdbc.user" value="candidaturauser" />
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
					
		String nomeTXT = "/home/u13/Projetos/DadosTXT/PrestacaoFinal/candidato/SP/ReceitasCandidatos.csv";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("candidaturasdb");
		EntityManager em = factory.createEntityManager(); 
		
		ReceitasCandidatos receitas = new ReceitasCandidatos();
		
		em.getTransaction().begin();
		em.createNativeQuery("LOAD DATA LOCAL INFILE :fileName INTO TABLE ReceitasCandidatos fields terminated by \",\" lines terminated by \"\\\n\" ").setParameter("fileName", nomeTXT).executeUpdate();
		em.persist(receitas);
		em.getTransaction().commit();
	}

	public static void main(String[] args) {
		receitasCandidatosTxt2BD();
		System.out.println("Terminou");
	}

	public enum TXTReceitasCandidatos {

	}

}
