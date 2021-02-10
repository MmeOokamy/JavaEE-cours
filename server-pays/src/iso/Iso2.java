package iso;


import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pays;



/**
 * Servlet implementation class Iso2
 */
@WebServlet("/pagerelou")
public class Iso2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private EntityManagerFactory factory;
	   private EntityManager em;
   
	   
	   /**
     * @see HttpServlet#HttpServlet()
     */
    public Iso2() {
        super();
      	//	factory = Persistence.createEntityManagerFactory("Legion");
	      //em = factory.createEntityManager();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String req = request.getParameter("code").toUpperCase();
		//Pays pays = em.find(Pays.class, req);
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("resultat de la requete" );
		pw.println(req);
		pw.println("</body></html>");
		pw.close();
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
