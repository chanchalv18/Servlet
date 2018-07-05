package google.chanchal.servlet;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //Database connection constant 
	String DB_NAME ="jdbc:mysql://localhost/ggits";
	String DB_USER="root";
	String DB_PASS="ggits";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Receive the parameters using POST
		
		String email =request.getParameter("email");
		String pwd =request.getParameter("pwd");
		
	
	//process the detail saving the parameters into database
		//require library MYSQL jar file 
		try{
		//register the driver in appache tomcat 
		DriverManager.registerDriver(new Driver());
		//create a connection 
		
		
		} catch(SQLException e){
			
		e.printStackTrace();	
		}
		
	}

}
