package net.imparando.esempiochoicetextalert;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EsempioController {
    @FXML
    private ChoiceBox choEsempio;
    @FXML
    private TextField txtEsempio;
    @FXML
    private Label welcomeText;
    @FXML
    void initialize()
    {
        String opzioni[] = {
            "Uno",
            "Due",
            "Tre"
        };
        choEsempio.getItems().addAll(opzioni);
        choEsempio.getSelectionModel().selectFirst();
    }

    @FXML
    protected void onHelloButtonClick() {
        String s = txtEsempio.getText();
        //Eventualmente elaboro s
        String opzione = (String)choEsempio.getSelectionModel().getSelectedItem();
        /*if (opzione.equals("Due"))
            s = s + " " + s;
        if (opzione.equals("Tre"))
            s = s + " " + s + " " + s;
        */
        Double numero  = 0.0;
        try {
             numero = Double.parseDouble(s);
        }catch (NumberFormatException e){
            System.out.println("Hai sbagliato a inserire");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore di immissione");
            alert.setHeaderText("Errore");
            alert.setContentText("Attenzione, devi inserire un numero");
            alert.showAndWait();
            txtEsempio.setText("");
            return;
        }
        if (opzione.equals("Due"))
            numero = numero * 2;
        if (opzione.equals("Tre"))
            numero = numero * 3;

        welcomeText.setText("Il risultato è " +  numero);

    }
}