package net.imparando.progettoconvertitore;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ConvertitoreController {
    @FXML
    private ChoiceBox choConversioni;
    @FXML
    private Label welcomeText;

    @FXML
    void initialize(){
        //Inserisce i valori da mostrare
        choConversioni.getItems().add("Metri -> Yarde");
        choConversioni.getItems().add("Yarde -> Metri");
        //Mostro il primo item della lista
        choConversioni.getSelectionModel().selectFirst();


    }

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText((String) choConversioni.getSelectionModel().getSelectedItem());
    }
}