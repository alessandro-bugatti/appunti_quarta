module net.imparando.tastieraenigma {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.tastieraenigma to javafx.fxml;
    exports net.imparando.tastieraenigma;
}