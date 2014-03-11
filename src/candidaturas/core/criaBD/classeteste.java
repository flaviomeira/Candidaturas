package candidaturas.core.criaBD;


import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.ReceitasCandidatos;

public class classeteste {

	public static void teste(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("candidaturasdb"); 
		EntityManager em = factory.createEntityManager();

		ReceitasCandidatos prestContas = new ReceitasCandidatos();
		prestContas.setCargo("TesteCargo");

		em.getTransaction().begin();
		em.persist(prestContas);
		em.getTransaction().commit();
		
		prestContas = new ReceitasCandidatos();

		prestContas.setCPF_CNPJ_do_doador("CPF_CNPJ_do_doador");

		em.getTransaction().begin();
		em.persist(prestContas);
		em.getTransaction().commit();
		em.close();
	}
	

	public static void main(String[] args) throws IOException{
		teste();

	}
}