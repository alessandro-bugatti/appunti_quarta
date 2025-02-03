module net.imparando.combo {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.combo to javafx.fxml;
    exports net.imparando.combo;
}