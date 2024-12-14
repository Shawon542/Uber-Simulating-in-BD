package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class StartRideController {

    @FXML
    private Label rideStatusLabel;

    @FXML
    private void acceptRide() {
        rideStatusLabel.setText("Ride has started!");

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ride Started");
        alert.setHeaderText(null);
        alert.setContentText("The ride has successfully started.");

        alert.showAndWait();
    }
}
