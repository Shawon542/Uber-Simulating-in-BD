package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class AcceptRideController {

    @FXML
    private Label pickuplocationLabel;

    @FXML
    private Label destinationLabel;

    @FXML
    private void acceptRide() {
        // Simulate accepting the ride
        String pickupLocation = pickuplocationLabel.getText();
        String destinationLocation = destinationLabel.getText();

        // Display a confirmation alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ride Accepted");
        alert.setHeaderText(null);
        alert.setContentText("Ride from " + pickupLocation + " to " + destinationLocation + " has been accepted.");

        alert.showAndWait();
    }
}
