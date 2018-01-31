package sample;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;

public class Controller {

    @FXML
    private MenuBar menu;
    @FXML
    private Pane ji;
    @FXML
    private CheckBox randomize;

    private KanjiModel model;
    private AnimatedGif animation;
    private Main mainApplication;
    private Level currentLevel;

    private void getAnimation(Path path) {
        ji.getChildren().clear();
        animation = new AnimatedGif(path, 8000);
        animation.setCycleCount(javafx.animation.Animation.INDEFINITE);
        animation.play();
        animation.getView().setFitWidth(300);
        animation.getView().setFitHeight(250);
        ji.getChildren().addAll(animation.getView());
    }

    @FXML
    private void onLevelSelected(ActionEvent event) {
        String menuItemId = ((MenuItem)event.getSource()).getId();
        currentLevel = Level.valueOf(menuItemId.toUpperCase());
        model.changeLevel(currentLevel, randomize.isSelected());
        getAnimation(model.getCurrentKanji());
    }

    @FXML
    private void onSelectedListener() {
        if (mainApplication == null || model == null) {
            return;
        }
        if (randomize.isSelected()) {
            model.changeLevel(currentLevel, true);
        } else {
            model.changeLevel(currentLevel, false);
        }
        getAnimation(model.getCurrentKanji());
    }


    void setMainApplication(Main mainApplication) {
        this.mainApplication = mainApplication;
        currentLevel = Level.HIRAGANA;
        this.model = new KanjiModel(currentLevel, randomize.isSelected());
        getAnimation(model.getCurrentKanji());
        mainApplication.getScene().setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ESCAPE)) {
                System.exit(0);
            } else if (event.getCode().equals(KeyCode.SPACE)) {
                if (animation.isPlaying()) {
                    animation.pause();
                } else {
                    animation.play();
                }
            } else if (event.getCode().equals(KeyCode.LEFT)) {
                getPreviousKanji();
            } else if (event.getCode().equals(KeyCode.RIGHT)) {
                getNextKanji();
            }
        });
    }

    private void getPreviousKanji() {
        getAnimation(model.getPreviousKanji());
    }

    private void getNextKanji() {
        getAnimation(model.getNextKanji());
    }

    public class AnimatedGif extends Animation {

        public AnimatedGif(Path path, double durationMs) {

            GifDecoder d = new GifDecoder();
            try {
                d.read(new FileInputStream(new File(path.toUri())));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Image[] sequence = new Image[ d.getFrameCount()];
            for( int i=0; i < d.getFrameCount(); i++) {

                WritableImage wimg = null;
                BufferedImage bimg = d.getFrame(i);
                sequence[i] = SwingFXUtils.toFXImage( bimg, wimg);

            }

            super.init( sequence, durationMs);
        }

    }

    public class Animation extends Transition {

        private ImageView imageView;
        private int count;

        private int lastIndex;

        private Image[] sequence;
        private boolean playing;

        private Animation() {
        }

        public Animation( Image[] sequence, double durationMs) {
            init( sequence, durationMs);
        }

        private void init( Image[] sequence, double durationMs) {
            this.imageView = new ImageView(sequence[0]);
            this.sequence = sequence;
            this.count = sequence.length;

            setCycleCount(1);
            setCycleDuration(Duration.millis(durationMs));
            setInterpolator(Interpolator.LINEAR);

        }

        protected void interpolate(double k) {

            final int index = Math.min((int) Math.floor(k * count), count - 1);
            if (index != lastIndex) {
                imageView.setImage(sequence[index]);
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

}
