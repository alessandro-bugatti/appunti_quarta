module com.example.contatore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contatore to javafx.fxml;
    exports com.example.contatore;
}