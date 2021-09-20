/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_coffee_machine;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author alex_2
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton rdbCaffe;
    
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
    
   
    @FXML
    private Button btnInserisci;
    @FXML
    private TextField txtMoneta;
    @FXML
    private Label lblRisultato;
    
    
    private DistributoreBevande distributore;
    @FXML
    private Label lblInformazioniPrezzo;
    @FXML
    private RadioButton rdbCioccolato;
    @FXML
    private RadioButton rdbMokkaccino;
    @FXML
    private RadioButton rdbCappuccino;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        distributore = new DistributoreBevande(4);
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
            
            //Soluzione due, più elegante e compatta
            //lblZucchero.setText(etichetteZucchero[newValue.intValue()]);
            
            //Soluzione tre, creo una classe per gestire bevande e zucchero
            //che è la soluzione più orientata agli oggetti
            distributore.setZucchero(newValue.intValue());
            lblZucchero.setText(distributore.getZucchero());
            
        }
        
        
        );
        rdbCaffe.selectedProperty().setValue(true);
        handlePrezzoCaffe(null);
    }    

    @FXML
    private void handlePrezzoCaffe(ActionEvent event) {
        this.mostraPrezzo("Caffè");
    }

    @FXML
    private void handlePrezzoCappuccino(ActionEvent event) {
        this.mostraPrezzo("Cappuccino");
    }
    
    private void mostraPrezzo(String bevanda)
    {
        distributore.setBevandaScelta(bevanda);
        lblPrezzo.setText("Prezzo: " + distributore.getPrezzo() + " euro.");
    }

    @FXML
    private void handleBtnEroga(ActionEvent event) {
        lblRisultato.setText(distributore.toString());
        btnInserisci.disableProperty().setValue(false);
        lblInformazioniPrezzo.setText("Stato:");
        txtMoneta.setText("");
    }

    @FXML
    private void handleBtnInserisci(ActionEvent event) {
        double moneta = Double.parseDouble(txtMoneta.getText());
        distributore.inserisciMoneta(moneta);
        double soldiMancanti = distributore.getSoldiMancanti();
        //Il formatter non è essenziale, serve solo a evitare
        //una lunghissima serie di cifre decimali in alcuni casi
        DecimalFormat formatter = new DecimalFormat("#0.00"); 
        if (soldiMancanti > 0)
        {
            String soldi = formatter.format(soldiMancanti);
            lblInformazioniPrezzo.setText("Mancano ancora: " + soldi + " euro.");
        }
        else if (soldiMancanti < 0)
        {
            String soldi = formatter.format(-soldiMancanti);
            lblInformazioniPrezzo.setText("Ti verrà dato un resto di " + (soldi) + 
                    " euro. Preleva la bevanda.");
            btnInserisci.disableProperty().setValue(true);
        }
        else
        {
            lblInformazioniPrezzo.setText("Nessun resto, preleva la bevanda");
            btnInserisci.disableProperty().setValue(true);
        }
    }   

    @FXML
    private void handlePrezzoCioccolato(ActionEvent event) {
        this.mostraPrezzo("Cioccolato");
    }

    @FXML
    private void handlePrezzoMokkaccino(ActionEvent event) {
        this.mostraPrezzo("Mokkaccino");
    }


        
}
