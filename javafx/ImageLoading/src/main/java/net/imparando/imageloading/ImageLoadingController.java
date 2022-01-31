package net.imparando.imageloading;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class ImageLoadingController {
    @FXML
    private ImageView imgFoto;
    @FXML
    private Button btnMostra;
    @FXML
    private Label txtInformazioni;

    @FXML
    private void initialize(){
        //File che legge il file immagine e lo carica in memoria
        FileInputStream input = null;
        try {
            //Viene recuperato il percorso del file fisico sul disco
            File f = Paths.get(ImageLoadingController.class.getResource("images/alan-turing.jpg").toURI()).toFile();
            //Si apre il file e lo si carica, riferendolo con l'oggetto input
            input = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            System.out.println("Errore, file non trovato.");
            return;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        //La classe Image gestisce la rappresentazione
        //in base al formato grafico
        Image image = new Image(input);
        //Si passa l'immagine al controllo ImageView che si occupa di mostrarla
        //a video
        btnMostra.setText("Nascondi");
        imgFoto.setImage(image);
        imgFoto.setVisible(true);
    }

    @FXML
    protected void onMostraButtonClick() {
        if (imgFoto.isVisible()){
            imgFoto.setVisible(false);
            btnMostra.setText("Mostra");
            txtInformazioni.setText("L'immagine è stata nascosta.");
        }
        else{
            imgFoto.setVisible(true);
            btnMostra.setText("Nascondi");
            txtInformazioni.setText("Ecco l'immagine");
        }

    }
}