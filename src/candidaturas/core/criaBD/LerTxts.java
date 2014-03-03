package candidaturas.core.criaBD;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
//import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LerTxts")
public class LerTxts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LerTxts() {
        super();      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		lerReceitaTxt(request, response);
	}
	
	protected void lerReceitaTxt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getParameter(null);
		// inserir hibernate no projeto
		// Instlaar mysql 
		// criar m odelos no hbinertate
		// ler primeiro arquivo
		PrintWriter out = response.getWriter();
		out.println("<HTML><BODY>" + request.getParameter("nomeArquivo") + "</BODY></HTML>");
		
	}

}
