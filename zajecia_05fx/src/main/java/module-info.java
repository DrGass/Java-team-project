module com.example.zajecia_05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zajecia_05 to javafx.fxml;
    exports com.example.zajecia_05;
}