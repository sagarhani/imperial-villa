package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginreq
 */
public class Loginreq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginreq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		if(uname.equals("sagar") && password.equals("hani"))
		{
			
			request.setAttribute("fname", "Sagar");
			request.setAttribute("lname", "Hani");
			request.getRequestDispatcher("/welcome.jsp").forward(request,response);
			
		}
		else
		{
			request.getRequestDispatcher("/register.html").forward(request, response);
		}
			
		

		
		
		
		
	}

}
