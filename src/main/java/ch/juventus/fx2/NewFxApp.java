package ch.juventus.fx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class NewFxApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        NewFxmlController controller = new NewFxmlController();
        FXMLLoader loader = new FXMLLoader();
        String layoutLocation = "file:///C:/Users/yanik/swe2-excercises/src/main/java/ch/juventus/fx2/layout.fxml";
        loader.setLocation(new URL(layoutLocation));
        loader.setController(controller);
        GridPane grid = loader.load();
        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}