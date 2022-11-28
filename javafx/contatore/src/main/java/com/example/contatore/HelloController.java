package com.example.contatore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblContatore;

    //Modello all'interno dell'applicazione
    private int contatore = 0;


    public void onBtnIncrementaClick(ActionEvent actionEvent) {
        //Aggiorno il modello
        contatore++;
        if (contatore > 15)
            this.onBtnResetClick(null);
        //Aggiorno la view
        lblContatore.setText("" + contatore);
    }

    public void onBtnDecrementaClick(ActionEvent actionEvent) {
        //Aggiorno il modello
        contatore--;
        if (contatore < 0)
            contatore = 0;
        //Aggiorno la view
        lblContatore.setText("" + contatore);
    }
    public void onBtnResetClick(ActionEvent actionEvent) {
        //Aggiorno il modello
        contatore = 0;
        //Aggiorno la view
        lblContatore.setText("" + contatore);
    }
}