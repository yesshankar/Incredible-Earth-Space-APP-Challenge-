package like;

import like.ImageCountService;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: saneel
 * Date: 4/13/14
 * Time: 1:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImageLike extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ImageCountService img = new ImageCountService();
        System.out.println("I am here");
        String imageId = request.getParameter("submitlike");

        if(imageId!=null && !imageId.contentEquals("")) {
            System.out.println("inside like click, imgid = " + imageId);
            img.updateCountOfImage(imageId);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
    }
}
