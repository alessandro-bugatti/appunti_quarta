module com.example.esempio_menu {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.esempio_menu to javafx.fxml;
    exports net.imparando.esempio_menu;
}