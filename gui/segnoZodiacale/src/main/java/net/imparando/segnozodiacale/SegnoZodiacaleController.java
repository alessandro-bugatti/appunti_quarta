package net.imparando.segnozodiacale;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class SegnoZodiacaleController {
    @FXML
    private DatePicker calNascita;
    @FXML
    private Label txtMessaggio;

    @FXML
    protected void onMostraButtonClick() {
        //String data = calNascita.getValue().toString();
        LocalDate data = calNascita.getValue();
        int anno = data.getYear();
        int mese = data.getMonthValue();
        int giorno = data.getDayOfMonth();
        txtMessaggio.setText("La data inserita è " + giorno + "/" + mese + "/" + anno );
    }
}