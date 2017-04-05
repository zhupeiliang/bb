package Elss;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class biaodashi
 */
@WebServlet("/biaodashi")
public class biaodashi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public biaodashi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 request.setAttribute("userName", "admin");
		    request.setAttribute("name","zhangsan");
		    String []ass={"1","2","3","4","5"};
		    request.setAttribute("shu",ass);
		    request.getRequestDispatcher("show.jsp").forward(request, response);
		
		
	}

	
}
