package net.imparando.progettocodicefiscale;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CodiceFiscaleController {
    @FXML
    private TextField txtCognome;
    @FXML
    private Label welcomeText;

    private boolean isVocale(char c)
    {
        if (c == 'A' || c == 'E' ||c == 'I' ||
                c == 'O' ||c == 'U')
            return true;
        return false;
    }

    @FXML
    protected void onHelloButtonClick() {
        if (txtCognome.getText().length() == 0){
            //Per un semplice tutorial sui dialog
            //vedere https://code.makery.ch/blog/javafx-dialogs-official/
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore di inserimento");
            alert.setHeaderText("Dato obbligatorio");
            alert.setContentText("Attenzione: il cognome è obbligatorio");
            alert.showAndWait();
            return;
        }
        String cognome = txtCognome.getText();
        cognome = cognome.toUpperCase();
        String codiceFiscale = "";
        int contatore = 0;
        for (int i = 0; i < cognome.length(); i++) {
            if (isVocale(cognome.charAt(i)) == false){
                codiceFiscale += cognome.charAt(i);
                contatore++;
            }
            if (contatore == 3)
                break;
        }

        welcomeText.setText(codiceFiscale);
    }
}