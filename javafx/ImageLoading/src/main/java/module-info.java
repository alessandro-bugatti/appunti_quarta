module com.example.imageloading {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.imageloading to javafx.fxml;
    exports net.imparando.imageloading;
}