module com.example.uber {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uber to javafx.fxml;
    exports com.example.uber;
    exports com.example.uber.Shawon_2320246;
    opens com.example.uber.Shawon_2320246 to javafx.fxml;

}