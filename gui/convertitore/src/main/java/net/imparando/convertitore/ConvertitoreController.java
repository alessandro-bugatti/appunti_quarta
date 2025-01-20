package net.imparando.convertitore;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class ConvertitoreController {
    @FXML
    private ChoiceBox choConversioni;
    @FXML
    private Label lblRisultato;

    @FXML
    public void initialize(){
        choConversioni.getItems().add("Metri -> Yarde");
        choConversioni.getItems().add("Miglia -> Km");
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Dollari -> Euro");
        ar.add("Euro -> Dollari");
        choConversioni.getItems().addAll(ar);
        choConversioni.getSelectionModel().selectFirst();
    }

    @FXML
    protected void onHelloButtonClick() {
        String valore;
        valore = (String)choConversioni.getSelectionModel().getSelectedItem();
        int indice;
        indice = choConversioni.getSelectionModel().getSelectedIndex();
        lblRisultato.setText(valore + " -> " + indice);
    }
}