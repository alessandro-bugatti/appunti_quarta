/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_convertitore;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Alessandro Bugatti
 * Le istruzioni possono essere trovate qui
 * https://youtu.be/6RmBbl8ClI0
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnConverti;
    @FXML
    private TextField txtValore;
    @FXML
    private ChoiceBox<String> choConversioni;
    @FXML
    private Label lblValore;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Da inserire il codice per inserire le conversioni 
        //nell'oggetto di classe Convertitore e poi aggiungerli al
        //ChoiceBox partendo da quella
        choConversioni.getItems().add("Euro->Dollaro");
        choConversioni.getItems().add("Dollaro->Euro");
    }    

    @FXML
    private void handleBtnConverti(ActionEvent event) {
        String s = txtValore.getText();
        double valore = Double.parseDouble(s);
        String scelta = choConversioni.getSelectionModel().getSelectedItem();
        //double valore = c.converti(scelta, 232.34);
        lblValore.setText("" + valore);
        System.out.println(scelta);
    }
    
}
