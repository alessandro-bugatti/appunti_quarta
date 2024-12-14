module net.imparando.contatore {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.contatore to javafx.fxml;
    exports net.imparando.contatore;
}