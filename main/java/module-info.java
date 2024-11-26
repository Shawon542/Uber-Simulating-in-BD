module com.example.uber {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uber to javafx.fxml;
    exports com.example.uber;
}