package net.imparando.segnozodiacale;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class SegnoZodiacaleController {
    @FXML
    private DatePicker calNascita;
    @FXML
    private Label lblMessaggio;

    @FXML
    protected void onMostraButtonClick() {
        //String data = calNascita.getValue().toString();
        LocalDate data = calNascita.getValue();
        int anno = data.getYear();
        int mese = data.getMonthValue();
        int giorno = data.getDayOfMonth();
        lblMessaggio.setText("Giorno " + giorno + " mese: " + mese + " anno: " + anno );
    }
}