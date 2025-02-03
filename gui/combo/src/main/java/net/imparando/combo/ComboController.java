package net.imparando.combo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class ComboController {
    public HBox hboxComuniStati;
    @FXML
    private CheckBox chkEstero;
    @FXML
    private Label welcomeText;
    @FXML
    private ChoiceBox choComuni;
    @FXML
    private ComboBox cmbStati;

    private boolean estero = false;

    @FXML
    void initialize(){
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            lista.add(i + 1);
        }
        for (int i = 50; i < 100; i++) {
            lista2.add(i + 1);
        }
        choComuni.getItems().addAll(lista);
        cmbStati.getItems().addAll(lista2);
        hboxComuniStati.getChildren().remove(cmbStati);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onEsteroSelected(ActionEvent actionEvent) {
        if (estero){
            //choNumeri.setVisible(true);
            //cmbNumeri.setVisible(false);
            hboxComuniStati.getChildren().remove(cmbStati);
            hboxComuniStati.getChildren().add(choComuni);
            estero = false;
        }
        else{
            //choNumeri.setVisible(false);
            //cmbNumeri.setVisible(true);
            hboxComuniStati.getChildren().remove(choComuni);
            hboxComuniStati.getChildren().add(cmbStati);
            estero = true;
        }
    }
}