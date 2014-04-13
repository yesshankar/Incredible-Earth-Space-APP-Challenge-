package viewalbum;

import createalbum.DatabaseStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * User: asim
 * Date: 4/13/14
 * Time: 5:34 AM
 */
public class ShowAlbum extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DatabaseStore databaseHandler = new DatabaseStore();
        List<Album> albums = databaseHandler.readFromDatabase("notimage");

        request.setAttribute("user_albums", albums);

        request.getRequestDispatcher("/showalbums.jsp").forward(request, response);
    }
}
