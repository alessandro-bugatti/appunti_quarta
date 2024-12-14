module net.imparando.hello_world {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.hello_world to javafx.fxml;
    exports net.imparando.hello_world;
}