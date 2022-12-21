package net.imparando.esempioscacchi;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class ScacchiController {
    @FXML
    public VBox vboxBoard;
    @FXML
    private Label welcomeText;

    @FXML
    private void initialize(){
        ImageView[] caselle = new ImageView[64];
        FileInputStream black = null, white = null, horse = null;
        try {
            //Viene recuperato il percorso del file fisico sul disco
            File f = Paths.get(ScacchiController.class.getResource("images/black.png").toURI()).toFile();
            //Si apre il file e lo si carica, riferendolo con l'oggetto input
            black = new FileInputStream(f);
            f = Paths.get(ScacchiController.class.getResource("images/white.png").toURI()).toFile();
            //Si apre il file e lo si carica, riferendolo con l'oggetto input
            white = new FileInputStream(f);
            f = Paths.get(ScacchiController.class.getResource("images/horse.png").toURI()).toFile();
            //Si apre il file e lo si carica, riferendolo con l'oggetto input
            horse = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            System.out.println("Errore, file non trovato.");
            return;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        Image[] images;
        images = new Image[2];
        images[0] = new Image(black);
        images[1] = new Image(white);
        Image imgHorse = new Image(horse);
        int casella_corrente = 0;
        int bn = 0;
        for (int i = 0; i < 8; i++) {
            HBox hbox = new HBox();
            hbox.setSpacing(2);
            for (int j = 0; j < 8; j++) {
                int riga = i, colonna = j;
                caselle[casella_corrente] = new ImageView();
                caselle[casella_corrente].setImage(images[bn]);
                caselle[casella_corrente].setOnMouseClicked(e -> {
                    System.out.println(e);
                    System.out.println("Casella " + riga + " " + colonna);
                    ImageView img = new ImageView(imgHorse);
                    hbox.getChildren().remove(colonna);
                    hbox.getChildren().add(colonna, img);

                });
                hbox.getChildren().add(caselle[casella_corrente]);
                bn = (bn + 1)%2;
            }
            bn = (bn + 1)%2;
            vboxBoard.getChildren().add(hbox);
        }

    }
}