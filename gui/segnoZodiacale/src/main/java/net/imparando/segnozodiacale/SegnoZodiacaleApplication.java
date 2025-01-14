package net.imparando.segnozodiacale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SegnoZodiacaleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SegnoZodiacaleApplication.class.getResource("segno-zodiacale-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Segno zodiacale");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}