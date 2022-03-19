package net.imparando.esempio_menu;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {

    @FXML
    private Label lblTesto;

    public void onSalutaMenuClick(ActionEvent actionEvent) {
        lblTesto.setText("Ciao ciao");
    }

    public void onEsciMenuClick(ActionEvent actionEvent) {
        Platform.exit();
    }
}