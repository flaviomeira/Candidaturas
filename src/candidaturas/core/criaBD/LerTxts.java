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
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		lerReceitaTxt(request, response);
	}
	
	protected void lerReceitaTxt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getParameter(null);
		PrintWriter out = response.getWriter();
		out.println("<HTML><BODY>" + request.getParameter("nomeArquivo") + "</BODY></HTML>");
		
	}

}
