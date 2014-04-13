import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



 public class BarChar extends HttpServlet {


    @Override
	public void init() {
		try {
		  Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


   @Override
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 OutputStream out = response.getOutputStream();
	     Statement stmt;
         ResultSet r;
       DefaultCategoryDataset bar;
       JFreeChart BarChartObject1;
       try{
		
			 final String DB_URL = "jdbc:mysql://localhost:3306/isac";
				
			 final String USER = "root";
			 final String PASS = "";
		
			 Connection conn =     DriverManager.getConnection(DB_URL,USER,PASS);
		     bar = new DefaultCategoryDataset();
		     stmt = conn.createStatement();
		     r = stmt.executeQuery("select category,sum(likeUP) as slup,sum(likeDown)as sldwn from countlike group by category");
		  
			   while (r.next()) 
			   {
				   String category = r.getString("category");
				   int marks = r.getInt("slup");
				   int likeDown = r.getInt("sldwn");
				   bar.addValue(marks,"like",category);
				   bar.addValue(likeDown, "Dislike", category);
			   }
			
			    BarChartObject1=ChartFactory.createBarChart(" Category Chart","Category","Total Likes",bar,PlotOrientation.VERTICAL,true,true,false);
			
			    response.setContentType("image/png");

                ChartUtilities.writeChartAsPNG(out, BarChartObject1, 400, 300);
       } catch (Exception e) {
		           e.printStackTrace();
		    }
		    finally {
		     out.close();
		  }
	}
 }