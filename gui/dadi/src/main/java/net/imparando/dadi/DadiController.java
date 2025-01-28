package net.imparando.dadi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class DadiController {
    @FXML
    private RadioButton rdbUno;
    @FXML
    private RadioButton rdbDue;
    @FXML
    private RadioButton rdbTre;
    @FXML
    private Label lblRisultato;

    private Lanciatore dadi;


    @FXML
    protected void onLanciaButtonClick() {
        dadi = new Lanciatore(1);
        if (rdbUno.isSelected())
            dadi = new Lanciatore(1);
        else if (rdbDue.isSelected())
            dadi = new Lanciatore(2);
        else if (rdbTre.isSelected())
            dadi = new Lanciatore(3);
        lblRisultato.setText("" + dadi.lancia());
    }
}