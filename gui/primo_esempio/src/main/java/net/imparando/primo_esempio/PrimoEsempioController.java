package net.imparando.primo_esempio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimoEsempioController {
    public TextField txtTesto;
    @FXML
    private Label welcomeText;

    private int contatore = 0;

    @FXML
    protected void onHelloButtonClick() {
        this.contatore++;
        System.out.println("Ciao" + contatore);
        welcomeText.setText(txtTesto.getText());
    }

    public void onResetButtonClick(ActionEvent actionEvent) {
        welcomeText.setText("");
    }
}