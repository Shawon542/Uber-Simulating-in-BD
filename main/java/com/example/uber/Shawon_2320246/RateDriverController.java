package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert.AlertType;

public class RateDriverController {

    @FXML
    private Slider ratingSlider;

    @FXML
    private void submitReview() {
        double rating = ratingSlider.getValue();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Review Submitted");
        alert.setHeaderText(null);
        alert.setContentText("You have rated the driver " + rating + " stars.");

        alert.showAndWait();
    }
}

