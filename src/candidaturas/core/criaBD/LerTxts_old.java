package candidaturas.core.criaBD;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;


import javax.servlet.ServletException;
//import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.ReceitasCandidatos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@WebServlet("/LerTxts")
public class LerTxts_old extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LerTxts_old() {
        super();      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//receitasCandidatosTxt2BD(request, response);
	}
	
	protected void receitasCandidatosTxt2BD(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ler txt ReceitasCandidatos.txt e inserir no banco de dados
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("candidaturasdb"); 
		EntityManager em = factory.createEntityManager();
		
		ReceitasCandidatos prestContas = new ReceitasCandidatos();
		prestContas.setCargo("TesteCargo");
		
		em.getTransaction().begin();
		em.persist(prestContas);
		em.getTransaction().commit();
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>" + request.getParameter("nomeArquivo") + "</BODY></HTML>");
		
	}

}
