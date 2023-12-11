package org.example.checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    public CheckBox chkPrimo;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        if (chkPrimo.isSelected())
            welcomeText.setText("Hai selezionato il primo");
        else
            welcomeText.setText("Non hai selezionato il primo");
    }
}