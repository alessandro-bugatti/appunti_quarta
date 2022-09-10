package net.imparando.contatore;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblContatore;

    //"Modello" di questa applicazione
    private int contatore = 0;

    private void checkContatore()
    {
        if (contatore == 10)
            contatore = -1;
    }
   @FXML
   public void onHelloButtonClick() {
        //Aggiorna il modello
        contatore++;
        //Aggiorniamo la vista
        lblContatore.setText("" + contatore);
        checkContatore();
    }
}