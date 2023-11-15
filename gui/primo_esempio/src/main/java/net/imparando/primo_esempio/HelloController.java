package net.imparando.primo_esempio;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    private int contatore = 0;

    @FXML
    protected void onHelloButtonClick() {
        this.contatore++;
        System.out.println("Ciao" + contatore);
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}