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
import javafx.scene.control.Button;
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
    @FXML
    private Label lblZucchero;
    @FXML
    private Button btnEroga;
    
    private String etichetteZucchero[];
    
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        etichetteZucchero = new String[5];
        etichetteZucchero[0] = "Niente zucchero";
        etichetteZucchero[1] = "Poco zucchero";
        etichetteZucchero[2] = "Zucchero normale";
        etichetteZucchero[3] = "Molto zucchero";
        etichetteZucchero[4] = "Zucchero a palate";
        //Aggiunge un listener che è una lambda function
        sldZucchero.valueProperty().addListener((observable, oldValue, newValue)
        -> {
            //Soluzione uno
            /*if (newValue.doubleValue() == 0.0)
                lblZucchero.setText("Niente zucchero");
            else if (newValue.doubleValue() == 1.0)
                lblZucchero.setText("Poco zucchero");
            else if (newValue.doubleValue() == 2.0)
                lblZucchero.setText("Zucchero normale");
            else if (newValue.doubleValue() == 3.0)
                lblZucchero.setText("Molto zucchero");
            else 
                lblZucchero.setText("Zucchero a palate");
            */
            lblZucchero.setText(etichetteZucchero[newValue.intValue()]);
            
            
        }
        
        );
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

    @FXML
    private void handleBtnEroga(ActionEvent event) {
        System.out.println("Zucchero " + etichetteZucchero[(int)sldZucchero.getValue()]);
    }
}
