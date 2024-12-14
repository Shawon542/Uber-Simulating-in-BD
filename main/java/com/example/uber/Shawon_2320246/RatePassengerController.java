package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert.AlertType;

public class RatePassengerController {

    @FXML
    private Slider ratingSlider;

    @FXML
    private void submitRating() {
        double rating = ratingSlider.getValue();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Rating Submitted");
        alert.setHeaderText(null);
        alert.setContentText("You have rated the passenger " + rating + " stars.");

        alert.showAndWait();
    }
}

