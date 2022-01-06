package com.niit.java23;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DemoDownloadImage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://3.bp.blogspot.com/-uPMofl4WzDs/WN_ymn5kzGI/AAAAAAAAB20/UMjdLbh9H2QPttCfGGl97-HAXiRDlRU2QCLcB/s1600/Natural-Scenery%2B4k%2B%252880%2529.jpg");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = url.openStream();//chuyển đổi cái url thành stream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/download-image.jpg");
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            bufferedInputStream.close();
            inputStream.close();
        } catch (Exception e) {

        }
    }
}
