package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;

public class PaymentController {

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private void initialize() {
        paymentMethodComboBox.getItems().addAll("Bkash", "Nagad",  "Cash");
    }

    @FXML
    private void confirmPayment() {
        String selectedMethod = paymentMethodComboBox.getValue();

        if (selectedMethod != null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Payment Confirmed");
            alert.setHeaderText(null);
            alert.setContentText("You have selected " + selectedMethod + " as your payment method.");

            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("No Payment Method Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select a payment method before confirming.");

            alert.showAndWait();
        }
    }
}
