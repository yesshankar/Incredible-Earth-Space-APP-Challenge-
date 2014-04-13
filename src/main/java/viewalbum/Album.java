package viewalbum;

import java.util.LinkedList;
import java.util.List;
/**
 * User: asim
 * Date: 4/13/14
 * Time: 9:46 AM
 */
public class Album {

    private String albumName;
    private String albumDesc;
    private List<String> imageUrls;

    public Album(String albumName, String albumDesc, List<String> imageUrls) {
        this.albumName = albumName;
        this.albumDesc = albumDesc;
        this.imageUrls = imageUrls;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getAlbumDesc() {
        return albumDesc;
    }

    public void setAlbumDesc(String albumDesc) {
        this.albumDesc = albumDesc;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
