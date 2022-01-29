package net.imparando.searchablecombobox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchableComboBoxApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SearchableComboBoxApplication.class.getResource("searchablecombobox-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Uso del SearchableComboBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}