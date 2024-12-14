package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TrackRideController {

    @FXML
    private Label driverDetailsLabel;

    @FXML
    private Label liveLocationLabel;

    @FXML
    private void initialize() {
        driverDetailsLabel.setText("Driver: Safin, Vehicle: Toyota Prius");
        liveLocationLabel.setText("Location: Badda,Dhaka.");
    }
}
