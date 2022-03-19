module net.imparando.esempiotimeline {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.esempiotimeline to javafx.fxml;
    exports net.imparando.esempiotimeline;
}