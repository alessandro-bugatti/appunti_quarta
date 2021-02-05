/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_sandwich;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author alex_2
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private CheckBox chkLattuga;
    @FXML
    private Button btnCalcola;
    @FXML
    private ChoiceBox<String> choSandwich;
    @FXML
    private ImageView imgSandwich;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choSandwich.getItems().addAll("Club Sandwich", "New York Sandwich");
        //Devo istruire il ChoiceBox "dicendogli" che metodo chiamare
        //quando si verifica l'azione di cambio della voce di menù
        choSandwich.setOnAction(this::handleChoSandwich);
    
    }    

    @FXML
    private void handleBtnCalcola(ActionEvent event) {
        if (chkLattuga.isSelected())
            System.out.println("Hai scelto la lattuga");
    }
    
    @FXML
    private void handleChoSandwich(ActionEvent event) {
        //Codice di esempio per il caricamento di un'immagine
        //L'oggetto input carica il file in memoria
        FileInputStream input = null;
        try {
            input = new FileInputStream("resources/images/" + "clubsandwich.jpg");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //La classe Image gestisce la rappresentazione 
        //in base al formato grafico
        Image image = new Image(input);
        //Do in pasto l'immagine al componente grafico
        //ImageView che si preoccupa di metterla a video
        imgSandwich.setImage(image);
    }
    
}
