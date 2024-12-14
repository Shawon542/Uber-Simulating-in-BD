package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DriverLoginController {

    @FXML
    private void autoLogin() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Login Successful");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to the Driver App!");
        alert.showAndWait();
    }
}


