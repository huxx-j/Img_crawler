import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Downloader {
    protected void imageDownloader(String title, String date, String imageUrl){

        File outputFile = new File("C:/Users/test/Desktop/123/"+title+".png");

        URL url;
        BufferedImage bi;


            try {
                url = new URL(imageUrl);
                bi = ImageIO.read(url);
                ImageIO.write(bi, "png", outputFile);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
