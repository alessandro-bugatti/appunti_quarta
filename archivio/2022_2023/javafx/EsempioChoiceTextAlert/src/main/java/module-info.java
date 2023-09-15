module net.imparando.esempiochoicetextalert {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.imparando.esempiochoicetextalert to javafx.fxml;
    exports net.imparando.esempiochoicetextalert;
}