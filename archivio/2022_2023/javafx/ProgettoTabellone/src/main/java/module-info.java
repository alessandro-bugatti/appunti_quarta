module com.example.progettotabellone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progettotabellone to javafx.fxml;
    exports com.example.progettotabellone;
}