module org.example.caricamentoimmagine {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.caricamentoimmagine to javafx.fxml;
    exports org.example.caricamentoimmagine;
}