/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_veicoli;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author alex_2
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblTassa;
    
    private Veicolo veicoli[];
    @FXML
    private ChoiceBox<Veicolo> choVeicoli;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        veicoli = new Veicolo[3];
        veicoli[0] = new Autoveicolo("AN676HH", "FIAT", "Punto", 2019, 5,
                            "Benzina","Metano",44.5);
        veicoli[1] = new Motoveicolo("RT935GG", "Honda", "CBR", 
                2020, 2, 56.5);
        veicoli[2] = new Motoveicolo("MM447KD", "Suzuki", "GSX", 
                2020, 2, 68.5);
        
        choVeicoli.getItems().addAll(veicoli);
        choVeicoli.getSelectionModel().selectFirst();
        choVeicoli.setOnAction(this::handleChoVeicolo);
    }    
    
    private void handleChoVeicolo(ActionEvent event)
    {
        lblTassa.setText("Tassa: " + choVeicoli.getSelectionModel().
                getSelectedItem().calcolaTassa());
    }
}
