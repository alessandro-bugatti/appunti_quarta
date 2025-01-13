package net.imparando.codicefiscale;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CodiceFiscaleController {
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCognome;
    @FXML
    private Label lblCodiceFiscale;

    CodiceFiscale codice;

    @FXML
    protected void onCalcolaButtonClick() {
        String cognome = txtCognome.getText();
        String nome = txtNome.getText();
        codice = new CodiceFiscale(cognome, nome);
        lblCodiceFiscale.setText(codice.calcola());
    }
}