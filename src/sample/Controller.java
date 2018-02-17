package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

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

}
