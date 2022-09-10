module net.imparando.calendario {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.calendario to javafx.fxml;
    exports net.imparando.calendario;
}