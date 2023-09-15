module com.example.esempionotifiche {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.esempionotifiche to javafx.fxml;
    exports com.example.esempionotifiche;
}