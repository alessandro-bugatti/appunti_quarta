package net.imparando.calendario;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class CalendarioController {
    @FXML
    private DatePicker cldData;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        LocalDate d = cldData.getValue();
        if (d == null)
            return;
        String m = "";
        int giorno = d.getDayOfMonth();
        int mese = d.getMonthValue();
        int anno = d.getYear();
        if (mese == 6)
            m = "H";
        welcomeText.setText("" + anno%100 + m + giorno);
    }
}