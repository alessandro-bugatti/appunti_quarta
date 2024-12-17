package net.imparando.contatore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ContatoreController {

    @FXML
    public Label lblTrasferta;
    @FXML
    public Label lblCasa;

    private Contatore casa, trasferta;



    @FXML
    public void initialize(){
        casa = new Contatore(25);
        trasferta = new Contatore(25);
    }


    public void btnCasaOnclick(ActionEvent actionEvent) {
        casa.incrementa();
        lblCasa.setText(casa.toString());

    }

    public void btnTrasfertaOnclick(ActionEvent actionEvent) {
        trasferta.incrementa();
        lblTrasferta.setText(trasferta.toString());
    }
}