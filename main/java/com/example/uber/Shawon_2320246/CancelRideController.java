package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CancelRideController {

    @FXML
    private void cancelRide() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ride Canceled");
        alert.setHeaderText(null);
        alert.setContentText("Your ride has been successfully canceled.");

        alert.showAndWait();
    }
}

