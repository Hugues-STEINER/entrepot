module ent.entrepot {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens ent.entrepot to javafx.fxml;
    exports ent.entrepot;
}