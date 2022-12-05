package com.example.progettotabellone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TabellonePallavoloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TabellonePallavoloApplication.class.getResource("tabellonePallavolo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tabellone Pallavolo 0.1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}