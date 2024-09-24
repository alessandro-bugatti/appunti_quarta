module net.imparando.primo_esempio {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.primo_esempio to javafx.fxml;
    exports net.imparando.primo_esempio;
}