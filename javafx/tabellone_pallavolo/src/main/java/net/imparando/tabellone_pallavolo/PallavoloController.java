package net.imparando.tabellone_pallavolo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PallavoloController {
    @FXML
    private Label lblCasa;
    @FXML
    private Label lblOspiti;

    private int punteggioCasa = 0;
    private int punteggioOspiti = 0;


    @FXML
    protected void onCasaButtonClick() {
        punteggioCasa++;
        lblCasa.setText("" + punteggioCasa);
    }

    @FXML
    public void onOspitiButtonClick() {
        punteggioOspiti++;
        lblOspiti.setText("" + punteggioOspiti);

    }
}