import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class RadioTest
 */
//@WebServlet("/RadioTest")
public class RadioTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in post");
		String submit = request.getParameter("submit");
		if(submit!=null) {
			System.out.println("in post finally");
			Connection conn = null;
	        PreparedStatement ps=null;
	        Statement st = null;
	        ResultSet resultSet = null;
	        
	        String imageId = request.getParameter("id");
	        String category = request.getParameter("category");

	        final String DB_URL = "jdbc:mysql://localhost/isac";

	        final String USER = "root";
	        final String PASS = "";


	        {

	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	                conn = DriverManager.getConnection(DB_URL, USER, PASS);
	                st = conn.createStatement();
	                System.out.println("I am going to update");
	                String query = "INSERT INTO countLike(imageId,category) VALUES(?,?)";

	        		try {
	        			Class.forName("com.mysql.jdbc.Driver");
	        			conn = DriverManager.getConnection(DB_URL,USER,PASS);
	        			ps = conn.prepareStatement(query);
	        			ps.setString(1,imageId);
	        			ps.setString(2,category);
	        			
	        			ps.executeUpdate();
	        			ps.close();
	        		} catch (Exception e) {
	        			e.printStackTrace();
	        		}finally{
	        			conn.close();
	        		}


	            } catch (Exception e1) {
	                e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	            }




	        }
	    }

		}
	}


