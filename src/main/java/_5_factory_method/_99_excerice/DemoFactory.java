package _5_factory_method._99_excerice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoFactory {
    public static void main(String[] args) throws IOException {

        ImageReaderFactory imageReaderFactory = new ImageReaderFactory();
        InputStream input = new URL("http://java-tips.org/source.gif").openStream();
        //GIF
        ImageReader imageReader = imageReaderFactory.getType(input);
        //JPEG
        InputStream input2 = new FileInputStream("Exo 3.jpeg");
        ImageReader imageReader2 = imageReaderFactory.getType(input2);
    }
}
