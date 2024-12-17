package net.imparando.contatore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ContatoreApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ContatoreApplication.class.getResource("contatore-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tabellone pallavolo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}