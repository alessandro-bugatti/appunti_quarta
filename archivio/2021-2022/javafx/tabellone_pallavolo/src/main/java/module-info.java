module net.imparando.tabellone_pallavolo {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.tabellone_pallavolo to javafx.fxml;
    exports net.imparando.tabellone_pallavolo;
}