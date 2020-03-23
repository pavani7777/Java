import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchserv
 */
@WebServlet("/searchserv")
public class searchserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public searchserv() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Key=request.getParameter("Key");
		String Designation=request.getParameter("Designation");
		String Company=request.getParameter("Company");
		String Location=request.getParameter("Location");
		
		if((Key!=null)&&(Designation!=null)&&(Company!=null)&&(Location!=null))
		{
		response.sendRedirect("page6.jsp");	
		}
		else
		{
			response.sendRedirect("page5.jsp");
		}
		doGet(request, response);
	}

}

