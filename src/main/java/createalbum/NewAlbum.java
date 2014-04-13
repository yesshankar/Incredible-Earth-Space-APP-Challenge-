package createalbum;

import com.google.gdata.client.photos.PicasawebService;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.media.MediaFileSource;
import com.google.gdata.data.photos.AlbumEntry;
import com.google.gdata.data.photos.AlbumFeed;
import com.google.gdata.data.photos.PhotoEntry;
import com.google.gdata.data.photos.UserFeed;
import sun.net.www.protocol.ftp.FtpURLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * User: asim
 * Date: 4/12/14
 * Time: 8:10 PM
 */
public class NewAlbum extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String albumName = request.getParameter("albumName");
        String albumDescription = request.getParameter("albumDescription");
        String[] imagesUrls = request.getParameterValues("imagesID");

        DatabaseStore databaseHandler = new DatabaseStore();
        databaseHandler.setAlbumName(albumName);
        databaseHandler.setAlbumDescription(albumDescription);
        databaseHandler.setImageUrls(imagesUrls);
        databaseHandler.store();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}