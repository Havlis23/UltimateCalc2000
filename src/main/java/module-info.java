module com.davidhavel.ultimatecalc2000 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.davidhavel.ultimatecalc2000 to javafx.fxml;
    exports com.davidhavel.ultimatecalc2000;
}