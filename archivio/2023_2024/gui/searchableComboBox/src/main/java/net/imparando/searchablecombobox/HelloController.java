package net.imparando.searchablecombobox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.controlsfx.control.SearchableComboBox;

public class HelloController {
    public SearchableComboBox searchCodici;
    @FXML
    private Label welcomeText;

    @FXML
    void initialize(){
        searchCodici.getItems().add("Brescia");
        searchCodici.getItems().add("Milano");
        searchCodici.getItems().add("Monza");
        searchCodici.getItems().add("Varese");

    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}