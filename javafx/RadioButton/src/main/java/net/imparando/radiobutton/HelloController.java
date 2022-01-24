package net.imparando.radiobutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private ToggleGroup linguaggio;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        RadioButton selected = (RadioButton)linguaggio.getSelectedToggle();
        if (selected != null && selected.getText().equals("C++"))
            welcomeText.setText("C++");
    }
}