module net.imparando.bottoni {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.bottoni to javafx.fxml;
    exports net.imparando.bottoni;
}