package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EndRideController {

    @FXML
    private Label fareCalculationLabel;

    @FXML
    private Label tripCompletionLabel;

    @FXML
    private void endRide() {
        String fare = "$25.00";


        tripCompletionLabel.setText("Trip Completed Successfully!");
        fareCalculationLabel.setText("Fare: " + fare);

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ride Ended");
        alert.setHeaderText(null);
        alert.setContentText("Your ride has ended. " + tripCompletionLabel.getText() + "\n" + fareCalculationLabel.getText());

        alert.showAndWait();
    }
}
