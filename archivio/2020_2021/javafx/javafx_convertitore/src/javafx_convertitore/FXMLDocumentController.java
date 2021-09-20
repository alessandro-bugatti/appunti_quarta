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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
    
    private Convertitore conv;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conv = new Convertitore();
        conv.aggiungi(new Conversione("Euro", "Dollaro", 1.21));
        conv.aggiungi(new Conversione("Dollaro", "Euro", 0.82));
        conv.aggiungi(new Conversione("Euro", "Sterlina", 0.89));
        conv.aggiungi(new Conversione("Sterlina", "Euro", 1.11));
        choConversioni.getItems().addAll(conv.getElenco());
        //Questo per evitare di avere il ChoiceBox che non
        //mostra niente all'avvio del programma
        choConversioni.getSelectionModel().selectFirst();
}    

    @FXML
    private void handleBtnConverti(ActionEvent event) {
        String s = txtValore.getText();
        double valore = 0;
        try{
            valore = Double.parseDouble(s);
        }catch(NumberFormatException e)
        {
            //Per un semplice tutorial sui dialog
            //vedere https://code.makery.ch/blog/javafx-dialogs-official/
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Errore di inserimento");
            alert.setHeaderText("Il valore da convertire deve essere un numero");
            alert.setContentText("Errore: " + e.getMessage());
            alert.showAndWait();
            return;
        }
        String scelta = choConversioni.getSelectionModel().getSelectedItem();
        valore = conv.converti(scelta, valore);
        lblValore.setText("" + valore);
        System.out.println(scelta);
    }
    
}
