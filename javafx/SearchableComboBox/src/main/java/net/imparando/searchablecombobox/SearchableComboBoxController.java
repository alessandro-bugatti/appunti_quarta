package net.imparando.searchablecombobox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.controlsfx.control.SearchableComboBox;

public class SearchableComboBoxController {

    @FXML
    private SearchableComboBox searchEsempio;
    @FXML
    private Label txtNome;

    @FXML
    void initialize(){
        searchEsempio.getItems().add("Alberto");
        searchEsempio.getItems().add("Anna");
        searchEsempio.getItems().add("Diego");
        searchEsempio.getItems().add("Francesca");
        searchEsempio.getItems().add("Maria");
    }

    @FXML
    protected void onHelloButtonClick() {
        txtNome.setText((String) searchEsempio.getSelectionModel().getSelectedItem());
    }
}