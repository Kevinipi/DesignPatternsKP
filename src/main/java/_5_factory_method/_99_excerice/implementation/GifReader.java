package _5_factory_method._99_excerice.implementation;

import _5_factory_method._99_excerice.ImageReader;
import _5_factory_method._99_excerice.ImageReaderFactory;
import _5_factory_method._99_excerice.ImageType;
import _5_factory_method._99_excerice.ImageUtil;

import java.awt.*;
import java.io.InputStream;

public class GifReader implements ImageReader {

    private InputStream in;
    private ImageReaderFactory imageReaderFactory;

    public GifReader(InputStream in) {
        this.in = in;
        ImageType imageType = ImageUtil.getImageType(in);
        if (imageType != ImageType.GIF) {
            throw new IllegalArgumentException("Type d'image incompatible");
        }
    }


    public ImageReaderFactory imageReaderFactory(){
        return imageReaderFactory;
    }
    public Image loadImage() {
        // fausse implémentation, inutile de la coder pour l'exercice
        return null;
    }
}
 