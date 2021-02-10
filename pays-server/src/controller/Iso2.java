package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;

import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletResponseWrapper;
import model.Pays;

/**
 * Servlet implementation class Iso2
 */
@jakarta.servlet.annotation.WebServlet("/Iso2")
public class Iso2 extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
	 private EntityManagerFactory factory;
  	   private EntityManager em;
    /**
     * Default constructor. 
     */
    public Iso2() {
        // TODO Auto-generated constructor stub
    	 factory = Persistence.createEntityManagerFactory("Legion");
         em = factory.createEntityManager();	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequestWrapper request, XHttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		String req = request.getParameter("code").toUpperCase();
		Pays pays = em.find(Pays.class, req);
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("resultat de la requete" + pays);
		pw.println("</body></html>");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequestWrapper request, HttpServletResponseWrapper response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
