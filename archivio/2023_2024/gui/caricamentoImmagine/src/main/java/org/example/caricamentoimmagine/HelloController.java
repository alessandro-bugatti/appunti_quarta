package org.example.caricamentoimmagine;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class HelloController {
    @FXML
    private ImageView imgImmagine;
    @FXML
    private Label welcomeText;
    @FXML
    void initialize() throws URISyntaxException, FileNotFoundException {
        FileInputStream file;
        File f = Paths.get(HelloController.class.getResource("images/alan-turing.jpg").toURI()).toFile();
        file = new FileInputStream(f);
        Image img = new Image(file);
        this.imgImmagine.setImage(img);
    }

    @FXML
    protected void onHelloButtonClick() {
        this.imgImmagine.setVisible(false);
        this.imgImmagine.setImage(null);
    }
}