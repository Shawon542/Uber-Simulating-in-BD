package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class RegisterDriverController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField licenseField;

    @FXML
    private TextField carInfoField;

    @FXML
    private void uploadDocuments() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Documents Uploaded");
        alert.setHeaderText(null);
        alert.setContentText("Documents have been successfully uploaded.");

        alert.showAndWait();
    }

    @FXML
    private void registerDriver() {
        String name = nameField.getText();
        String license = licenseField.getText();
        String carInfo = carInfoField.getText();

        if (name.isEmpty() || license.isEmpty() || carInfo.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Incomplete Information");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the fields.");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Registration Successful");
            alert.setHeaderText(null);
            alert.setContentText("Driver " + name + " has been registered successfully.");
            alert.showAndWait();
        }
    }
}
