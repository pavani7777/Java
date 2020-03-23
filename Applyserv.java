import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Applyserv
 */
@WebServlet("/Applyserv")
public class Applyserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Applyserv() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Full_name=request.getParameter("Full_name");
		String Email_add=request.getParameter("Email_add");
		String mes=request.getParameter("mes");
		String CV=request.getParameter("CV");
		
		if((Full_name!=null)&&(Email_add!=null)&&(mes!=null)&&(CV!=null))
		{
			response.sendRedirect("page8.jsp");
		}
		else
		{
			response.sendRedirect("page9.jsp");
		}
		doGet(request, response);
	}

}

