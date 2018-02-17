package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class AnimatedGif extends Animation {

    AnimatedGif(Path path, double durationMs) {

        GifDecoder d = new GifDecoder();
        try {
            d.read(new FileInputStream(new File(path.toUri())));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Image[] sequence = new Image[ d.getFrameCount()];
        List<SoftReference<Image>> sequence = new ArrayList<>(d.getFrameCount());
        for( int i=0; i < d.getFrameCount(); i++) {
            BufferedImage bimg = d.getFrame(i);
            sequence.add(new SoftReference<>(SwingFXUtils.toFXImage( bimg, null)));
        }

        super.init( sequence, durationMs);
    }

}
