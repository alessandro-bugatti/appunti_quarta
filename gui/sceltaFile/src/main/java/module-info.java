module net.imparando.sceltafile {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.sceltafile to javafx.fxml;
    exports net.imparando.sceltafile;
}