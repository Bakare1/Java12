package Network_Programming;

import java.io.InputStream;
import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("file:C:\\Users\\USER\\IdeaProjects\\Java12NewNiitStudent\\demo1\\demo2\\file1.txt");
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            InputStream is = url.openStream();
            int data = is.read();
            while (data != -1) {
                System.out.print((char) data); //prints: Hello! data = is.read();
                data=is.read();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
