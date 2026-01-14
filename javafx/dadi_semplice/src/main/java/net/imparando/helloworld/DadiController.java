package net.imparando.helloworld;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DadiController {
    @FXML
    private Label lblNumeroDadi;
    @FXML
    private Label lblNumero;
    @FXML
    private Label lblTipoDadi;

    @FXML
    protected void onNumeroDadi(Event e){
        String numero = ((Button)e.getSource()).getText();
        lblNumeroDadi.setText(numero);
    }

    @FXML
    protected void onTipoDadi(Event e){
        String numero = ((Button)e.getSource()).getText();
        lblTipoDadi.setText(numero);
    }

    @FXML
    protected void onNumero(){
        int n = Integer.parseInt(lblNumeroDadi.getText());
        int v = Integer.parseInt(lblTipoDadi.getText());
        int risultato = 0;
        for (int i = 0; i < n; i++) {
            risultato += (int)(Math.random() * v) + 1;
        }
        lblNumero.setText("" + risultato);
    }
}