module net.imparando.codicefiscale {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.codicefiscale to javafx.fxml;
    exports net.imparando.codicefiscale;
}