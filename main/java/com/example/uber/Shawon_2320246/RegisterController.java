package com.example.uber.Shawon_2320246;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label statusLabel;

    @FXML
    private void verifyPhone() {
        String phone = phoneField.getText();
        if (!phone.isEmpty()) {
            statusLabel.setText("Phone number verified successfully!");
        } else {
            statusLabel.setText("Please enter a phone number.");
        }
    }

    @FXML
    private void registerUser() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Please fill in all the fields.");
        } else {
            statusLabel.setText("Registration successful!");
        }
    }
}
