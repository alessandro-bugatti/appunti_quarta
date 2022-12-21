module net.imparando.progettocarte {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.progettocarte to javafx.fxml;
    exports net.imparando.progettocarte;
}