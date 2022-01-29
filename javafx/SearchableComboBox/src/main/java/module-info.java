module com.example.searchablecombobox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.imparando.searchablecombobox to javafx.fxml;
    exports net.imparando.searchablecombobox;
}