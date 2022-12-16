package net.imparando.esempiotimeline;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EsempioTimelineApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EsempioTimelineApplication.class.getResource("EsempioTimeline-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Esempio Timeline");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}