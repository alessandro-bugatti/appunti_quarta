module net.imparando.progettoconvertitore {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.progettoconvertitore to javafx.fxml;
    exports net.imparando.progettoconvertitore;
}