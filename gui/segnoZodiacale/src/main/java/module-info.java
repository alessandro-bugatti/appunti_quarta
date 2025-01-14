module net.imparando.segnozodiacale {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.segnozodiacale to javafx.fxml;
    exports net.imparando.segnozodiacale;
}