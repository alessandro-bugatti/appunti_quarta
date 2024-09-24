package net.imparando.convertitore;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private  ChoiceBox choScelta;
    @FXML
    private Label welcomeText;
    @FXML
    void initialize(){
        choScelta.getItems().add("Miglia >> Kilometri");
        choScelta.getItems().add("Due");
    }

    @FXML
    protected void onHelloButtonClick() {
        String s = (String) choScelta.getSelectionModel().getSelectedItem();
        welcomeText.setText(s);
    }
}