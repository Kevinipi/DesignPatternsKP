package _5_factory_method._99_excerice;

import _5_factory_method._99_excerice.implementation.GifReader;
import _5_factory_method._99_excerice.implementation.JpegReader;

import java.awt.*;
import java.io.InputStream;

public class ImageReaderFactory extends ImageUtil {
    // TODO
    public ImageReader getType(InputStream imageType){
        if (getImageType(imageType).equals(ImageType.GIF)){
            return (ImageReader) new GifReader(imageType).loadImage();
        }
        if (getImageType(imageType).equals(ImageType.JPEG)){
            return (ImageReader) new JpegReader(imageType).loadImage();
        }
        return null;
    }
}
