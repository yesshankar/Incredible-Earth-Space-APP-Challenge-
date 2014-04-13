package dwit;

/**
 * Created by kornsanz on 4/12/14.
 */
public class Service {

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
