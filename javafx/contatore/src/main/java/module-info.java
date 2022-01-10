module net.imparando.contatore {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.imparando.contatore to javafx.fxml;
    exports net.imparando.contatore;
}