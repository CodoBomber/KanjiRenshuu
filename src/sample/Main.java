package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Requires GifDecoder from here: http://www.java2s.com/Code/Java/2D-Graphics-GUI/DecodesaGIFfileintooneormoreframes.htm
 */
public class Main extends Application {

    private Stage primaryStage;
    private Pane rootLayout;
    private Scene scene;

    @Override
    public void start(Stage primaryStage) throws URISyntaxException, IOException {
//        HBox root = new HBox();
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("漢字の練習");

        initRootLayout();

    }

    private void initRootLayout() throws IOException {

       /* Button btPause = new Button( "Pause");
        btPause.setOnAction( e -> ani.pause());

        Button btResume = new Button( "Resume");
        btResume.setOnAction( e -> ani.play());
*/

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file://" + new File("sample.fxml").getAbsolutePath()));
        rootLayout = loader.load();
        scene = new Scene(rootLayout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        Controller controller = loader.getController();
        controller.setMainApplication(this);

    }

    public Scene getScene() {
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }


}
