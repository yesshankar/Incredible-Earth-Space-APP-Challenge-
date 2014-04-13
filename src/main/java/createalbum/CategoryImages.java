package createalbum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import dwit.ImageService;

/**
 * User: asim
 * Date: 4/12/14
 * Time: 11:09 PM
 */
public class CategoryImages extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String categoryName = request.getParameter("categoryName");
        ImageService imageService = new ImageService();

        List<String> imageUrls = imageService.getAllImage();        //get images only if the category matches in the database
        request.setAttribute("imagesUrlList", imageUrls);

        if(!imageUrls.isEmpty()){
            System.out.println("Inside Category Images");
            for(String item : imageUrls){

                System.out.println(item);
            }
        }
        System.out.println("\nForwarding to newAlbum.jsp");
        request.getRequestDispatcher("/newAlbum.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
