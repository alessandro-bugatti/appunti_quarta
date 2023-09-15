package net.imparando.progettocarte;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class CarteController {
    public HBox hboxCarte;
    public Button btnMostra;
    @FXML
    private Label welcomeText;

    private final int nCarte = 5;

    private int nuovaCarta;

    private ImageView[] carte;
    @FXML
    void initialize(){
        FileInputStream file = null;
        try {
            File f = Paths.get(CarteController.class.getResource("images/sfondo.png").toURI()).toFile();
            file = new FileInputStream(f);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Image sfondo = new Image(file);
        carte = new ImageView[nCarte];
        for (int i = 0; i < nCarte; i++) {
            carte[i] = new ImageView();
            carte[i].setImage(sfondo);
            if (i < 2)
                hboxCarte.getChildren().add(carte[i]);
            //if (i > 1)
            //    carte[i].setVisible(false);

        }
        nuovaCarta = 2;
    }

    public void onMostrCartaClick(ActionEvent actionEvent) {
        hboxCarte.getChildren().add(carte[nuovaCarta]);
        //carte[nuovaCarta].setVisible(true);
        //hboxCarte.getChildren().get(nuovaCarta).setVisible(true);
        nuovaCarta++;
    }

    public void onNascondiClick(ActionEvent actionEvent) {
        hboxCarte.getChildren().remove(0);
        //hboxCarte.setVisible(false);

    }
}