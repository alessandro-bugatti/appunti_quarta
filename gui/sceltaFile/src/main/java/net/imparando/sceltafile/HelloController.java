package net.imparando.sceltafile;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    private Stage stage;


    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void onHelloButtonClick() {
        FileChooser fc = new FileChooser();
        //Setta, se necessario, la directory iniziale che verrà mostrata dal FileChooser
        fc.setInitialDirectory(new File("."));
        //Setta, se necessario, dei filtri per mostrare solo alcuni tipi di file,
        //in questo esempio file di testo e di tutti i tipi
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("File di testo", "*.txt"),
                new FileChooser.ExtensionFilter("Tutti i file", "*.*")
        );


        File f = fc.showOpenDialog(stage);
        if (f != null)
            welcomeText.setText(f.getAbsolutePath());
    }
}