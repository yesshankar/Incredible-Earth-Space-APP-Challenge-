package createalbum;

import viewalbum.Album;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * User: asim
 * Date: 4/13/14
 * Time: 1:40 AM
 */
public class DatabaseStore {

    private String albumName;
    private String albumDescription;
    private String[] imageUrls;

    Connection conn = null;
    PreparedStatement ps=null;
    Statement st = null;
    ResultSet resultSet = null;

    final String DB_URL = "jdbc:mysql://localhost/isac";

    final String USER = "root";
    final String PASS = "";



    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription;
    }

    public String[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public DatabaseStore(){

    }

    public void store(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            st = conn.createStatement();
            for(String imageUrl : imageUrls)
                st.execute("insert into album(albumName, albumDesc, imageUrl) values('"+albumName+"', '"+albumDescription+"', '"+imageUrl+"');");

            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public List<Album> readFromDatabase(String quest){


        if(!quest.contentEquals("image")){

            String query = "select distinct albumName,albumDesc from album";
            List<Album> newAlbums = new LinkedList<Album>();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                st = conn.createStatement();

                resultSet = st.executeQuery(query);

                try {
                    while(resultSet.next()){

                        newAlbums.add(new Album(resultSet.getString("albumName"),
                                        resultSet.getString("albumDesc"), null));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            return newAlbums;
        }else{

            String query = "select distinct albumName,albumDesc from album";
            List<Album> newAlbums = new LinkedList<Album>();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                st = conn.createStatement();

                resultSet = st.executeQuery(query);

                try {
                    while(resultSet.next()){

                        newAlbums.add(new Album(resultSet.getString("albumName"),
                                resultSet.getString("albumDesc"), null));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            return newAlbums;
        }
    }
}