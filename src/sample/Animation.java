package sample;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Animation extends Transition {

    private ImageView imageView;
    private int count;

    private int lastIndex;

    private List<SoftReference<Image>> sequence;
    private boolean playing;

    Animation() {
    }

//    public Animation( Image[] sequence, double durationMs) {
//        init( sequence, durationMs);
//    }

    void init( /*Image[]*/List<SoftReference<Image>> sequence, double durationMs) {
        this.sequence = sequence;/*Arrays.stream(sequence)
                .map(SoftReference::new)
                .collect(Collectors.toList());*/
        this.imageView = new ImageView(this.sequence.get(0).get());
        this.count = sequence.size();

        setCycleCount(1);
        setCycleDuration(Duration.millis(durationMs));
        setInterpolator(Interpolator.LINEAR);

    }

    protected void interpolate(double k) {

        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            imageView.setImage(sequence.get(index).get());
            lastIndex = index;
        }

    }

    public ImageView getView() {
        return imageView;
    }

    public void pause() {
        super.pause();
        playing = false;
    }

    public void play() {
        super.play();
        playing = true;
    }

    public boolean isPlaying() {
        return this.playing;
    }
}
