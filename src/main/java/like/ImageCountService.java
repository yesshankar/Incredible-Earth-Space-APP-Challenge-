package like;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: saneel
 * Date: 4/12/14
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImageCountService{

    public  void updateCountOfImage(String imgid) {
        Connection conn = null;
        PreparedStatement ps=null;
        Statement st = null;
        ResultSet resultSet = null;

        final String DB_URL = "jdbc:mysql://localhost/isac";

        final String USER = "root";
        final String PASS = "";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            st = conn.createStatement();
            System.out.println("I am going to update");
            st.executeUpdate("update countLike set likeUP = likeUP+1 where imageId="+imgid);

            //resultSet.close();
            st.close();
            conn.close();

        } catch (Exception e1) {
            e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }



}
