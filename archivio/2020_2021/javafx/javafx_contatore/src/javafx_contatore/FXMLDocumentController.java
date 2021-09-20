/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_contatore;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author alex_2
 */
public class FXMLDocumentController implements Initializable {
    
    private Contatore contatore;
    @FXML
    private Button btnIncrementa;
    @FXML
    private Label lblContatore;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.contatore = new Contatore();
    }    

    @FXML
    private void handleBtnIncrementa(ActionEvent event) {
        this.contatore.incrementa();
        lblContatore.setText(contatore.toString());
    }
    
}
