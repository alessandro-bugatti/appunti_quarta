package com.example.esempionotifiche;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificheApplication extends Application {
    NotificheController controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NotificheApplication.class.getResource("notifiche-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        controller = fxmlLoader.getController();
        stage.setTitle("Esempio notifiche");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop(){
        System.out.println("Uscita");
        controller.onShutDown();
        Platform.exit();
    }


    public static void main(String[] args) {
        launch();
    }
}