package dwit;

import com.google.gdata.client.photos.PicasawebService;
import com.google.gdata.data.photos.AlbumEntry;
import com.google.gdata.data.photos.AlbumFeed;
import com.google.gdata.data.photos.PhotoEntry;
import com.google.gdata.data.photos.UserFeed;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kornsanz on 4/12/14.
 */
public class ImageService {

    public List<String> getAllImage()
    {
        String userName ="YOUR GOOGLE PICASA USERNAME";
        String password = "YOUR GOOGLE PICASA PASSWORD";
        System.out.println("Inside getallimage");
        PicasawebService myService = new PicasawebService("exampleCo-exampleApp-1");
        List<String> listUrl = new LinkedList<String>();
        try
        {
            myService.setUserCredentials(userName, password);
            URL feedUrl = new URL("https://picasaweb.google.com/data/feed/api/user/"+userName+"?kind=album");

            UserFeed myUserFeed = myService.getFeed(feedUrl, UserFeed.class);

            String id = "";
            List<AlbumEntry> albumEntries = myUserFeed.getAlbumEntries();
            System.out.println(albumEntries.isEmpty());
            AlbumEntry myAlbum = albumEntries.get(1);
                id = myAlbum.getGphotoId();
                System.out.println(id);
                //System.out.println(service.parseURL(id));


            System.out.println("UserName :"+userName);
            URL albumUrl = new URL("https://picasaweb.google.com/data/feed/api/user/"+userName+"/albumid/"+parseURL(id));
            System.out.println(albumUrl.toString());
            AlbumFeed feed = myService.getFeed(albumUrl, AlbumFeed.class);


            for(PhotoEntry photo : feed.getPhotoEntries()) {
                System.out.println("Photos");
                String photoUrl = photo.getTitle().getPlainText();
                System.out.println(parsePhotoUrl(photo.getMediaThumbnails().get(0).getUrl()));
                listUrl.add(parsePhotoUrl(photo.getMediaThumbnails().get(0).getUrl()));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Returning listUrl");
        return listUrl;
    }

    public String parseURL(String url)
    {
        String tokens [] = url.split("/");

        return tokens[(tokens.length)-1];
    }


    public String parsePhotoUrl(String url)
    {
        String tokens [] = url.split("/");
        tokens[tokens.length-2] = "s800";
        String newUrl = "";
        for (int i=0;i<tokens.length;i++)
        {

            newUrl = newUrl+tokens[i];
            if (i==tokens.length-1)
                break;


            newUrl = newUrl+"/";

        }

        return newUrl;
    }



}
