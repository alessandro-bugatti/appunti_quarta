/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_coffee_machine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author alex_2
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton rdbCaffe;
    @FXML
    private RadioButton rdbMoccaccino;
    
    private double prezzo = 0;
    private String bevanda = "";
    @FXML
    private Label lblPrezzo;
    @FXML
    private ToggleGroup grpBevande;
    @FXML
    private Slider sldZucchero;
    
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlePrezzoCaffe(ActionEvent event) {
        prezzo = 0.50;
        this.mostraPrezzo();
    }

    @FXML
    private void handlePrezzoMoccaccino(ActionEvent event) {
        prezzo = 0.70;
        this.mostraPrezzo();
    }
    
    private void mostraPrezzo()
    {
        if (rdbCaffe.isSelected())
            this.bevanda = "Caffè";
        lblPrezzo.setText("Prezzo:" + this.prezzo + " dollari.");
        System.out.println(sldZucchero.getValue());
        
    }
}
