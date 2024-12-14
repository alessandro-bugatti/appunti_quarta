package net.imparando.contatore;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ContatoreController {
    @FXML
    private Label welcomeText;

    private Contatore contatore;

    @FXML
    protected void initialize(){
        contatore = new Contatore(15);
    }

    @FXML
    protected void onHelloButtonClick() {
        contatore.incrementa();
        welcomeText.setText(contatore.toString());
        System.out.println("Ciao");
    }
}