package formation;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/demo")
public class Demo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x1 = req.getParameter("x1");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		DateFormat format = new SimpleDateFormat("hh:mm:ss");
		pw.println("<html><body>");
		pw.println("Il est exactement " + format.format(new Date()));
		pw.println("</body></html>");
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<html><body>");
		pw.println("La méthode POST n'est pas traitée par cette servlet");
		pw.println("</body></html>");
		pw.close();
	}

}
