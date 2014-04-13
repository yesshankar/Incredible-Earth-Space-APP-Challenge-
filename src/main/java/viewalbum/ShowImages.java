package viewalbum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import createalbum.DatabaseStore;
/**
 * User: asim
 * Date: 4/13/14
 * Time: 10:58 AM
 */
public class ShowImages extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String albumName = request.getParameter("albumName");

        DatabaseStore databaseStore = new DatabaseStore();
        databaseStore.readFromDatabase("asdf");
    }
}
