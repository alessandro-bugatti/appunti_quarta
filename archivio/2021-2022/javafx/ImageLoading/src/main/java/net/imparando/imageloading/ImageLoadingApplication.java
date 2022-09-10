package net.imparando.imageloading;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ImageLoadingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ImageLoadingApplication.class.getResource("imageloading-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Image Loading");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}