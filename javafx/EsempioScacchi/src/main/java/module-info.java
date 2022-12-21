module com.example.esempioscacchi {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.esempioscacchi to javafx.fxml;
    exports net.imparando.esempioscacchi;
}