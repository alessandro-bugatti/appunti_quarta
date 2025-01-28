module net.imparando.dadi {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.dadi to javafx.fxml;
    exports net.imparando.dadi;
}