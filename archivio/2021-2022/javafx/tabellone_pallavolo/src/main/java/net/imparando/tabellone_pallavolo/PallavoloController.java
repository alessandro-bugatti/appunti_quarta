package net.imparando.tabellone_pallavolo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.imparando.model.Partita;

public class PallavoloController {
    @FXML
    private Label lblCasa;
    @FXML
    private Label lblOspiti;

    //Modello primitivo
    //private int punteggioCasa = 0;
    //private int punteggioOspiti = 0;

    //Modello più sofisticato che usa una classe
    private Partita partita;

    @FXML
    private void initialize(){
        partita = new Partita();
    }

    @FXML
    protected void onCasaButtonClick() {
        partita.aggiungiPunto(Partita.CASA);
        aggiornaVista();
        }

    @FXML
    public void onOspitiButtonClick() {
        partita.aggiungiPunto(Partita.TRASFERTA);
        aggiornaVista();
    }

    private void aggiornaVista()
    {
        lblCasa.setText("" + partita.getPunteggio(Partita.CASA));
        lblOspiti.setText("" + partita.getPunteggio(Partita.TRASFERTA));

    }
}