module net.imparando.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.imparando.helloworld to javafx.fxml;
    exports net.imparando.helloworld;
}