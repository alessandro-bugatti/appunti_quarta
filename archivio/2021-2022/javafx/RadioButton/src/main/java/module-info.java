module net.imparando.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.radiobutton to javafx.fxml;
    exports net.imparando.radiobutton;
}