package org.example.radiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    public ToggleGroup scelte;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        RadioButton r = (RadioButton) scelte.getSelectedToggle();
        if (r != null)
            welcomeText.setText(r.getText());
        else
            welcomeText.setText("Fai una selezione");
    }

    public void onBtnReset(ActionEvent actionEvent) {
        for (Toggle t : scelte.getToggles()){
            t.setSelected(false);
        }
    }
}