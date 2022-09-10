module com.example.progettocodicefiscale {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.progettocodicefiscale to javafx.fxml;
    exports net.imparando.progettocodicefiscale;
}