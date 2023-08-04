module com.parcial1.primerparcial {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.parcial1.primerparcial to javafx.fxml;
    exports com.parcial1.primerparcial;
}