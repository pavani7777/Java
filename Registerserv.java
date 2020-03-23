import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registerserv
 */
@WebServlet("/Registerserv")
public class Registerserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Registerserv() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String text=request.getParameter("text");
			String usrmail=request.getParameter("usrmail");
			String usrtel=request.getParameter("usrtel");
			String user_password=request.getParameter("user_password");
			
			if(text.equals("pavani")&&(user_password.equals("77777")))
			{
				response.sendRedirect("page2.jsp");
			}
			else
			{
				response.sendRedirect("lostpage1.jsp");
			}
		doGet(request, response);
	}

}