module com.example.lab9_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab9_calculator to javafx.fxml;
    exports com.example.lab9_calculator;
}