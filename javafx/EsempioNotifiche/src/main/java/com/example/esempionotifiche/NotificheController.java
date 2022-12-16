package com.example.esempionotifiche;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.awt.*;

public class NotificheController {
    @FXML
    private Label welcomeText;

    private SystemTray tray;


    @FXML
    protected void onHelloButtonClick() throws AWTException {
        welcomeText.setText("Welcome to JavaFX Application!");

        //Parte che genera la notifica
        //Obtain only one instance of the SystemTray object
         tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Esempio di notifica");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("Esempio di notifica");
        tray.add(trayIcon);

        trayIcon.displayMessage("Questa è una notifica", "Testo della notifica", TrayIcon.MessageType.INFO);
    }

    public void onShutDown(){
        TrayIcon[] icons = tray.getTrayIcons();
        for (TrayIcon t: icons) {
            tray.remove(t);
        }
    }
}