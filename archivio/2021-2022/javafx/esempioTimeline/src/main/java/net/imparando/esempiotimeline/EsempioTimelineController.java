package net.imparando.esempiotimeline;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class EsempioTimelineController {
    @FXML
    private Label lblContatore;

    private Timeline timeline, timeline2;
    private int contatore;

    private void incrementa(){
        contatore++;
        lblContatore.setText("" + contatore);

    }
    public void initialize(){
        timeline = new Timeline(new KeyFrame(
                Duration.seconds(2),
                e -> incrementa()
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline2 = new Timeline(new KeyFrame(
                Duration.seconds(7),
                e -> decrementa()
        ));
        timeline2.setCycleCount(Animation.INDEFINITE);
        contatore = 0;
    }

    private void decrementa() {
        contatore--;
        lblContatore.setText("" + contatore);
    }

    public void onStartClick(ActionEvent actionEvent) {
        timeline.play();
        timeline2.play();
    }

    public void onStopClick(ActionEvent actionEvent) {
        timeline.stop();
        timeline2.stop();
    }
}