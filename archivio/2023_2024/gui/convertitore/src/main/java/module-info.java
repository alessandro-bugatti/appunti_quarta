module net.imparando.convertitore {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.convertitore to javafx.fxml;
    exports net.imparando.convertitore;
}