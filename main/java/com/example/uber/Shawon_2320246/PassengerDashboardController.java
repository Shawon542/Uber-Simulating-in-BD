package com.example.uber.Shawon_2320246;


import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class PassengerDashboardController {

    @FXML
    private StackPane mainContentPane;

    @FXML
    private void showRegister() {
        System.out.println("Show Register View");
    }

    @FXML
    private void showRequestRide() {
        System.out.println("Show Request Ride View");
    }

    @FXML
    private void showHistory() {
        System.out.println("Show View History View");
    }

    @FXML
    private void showTrackRide() {
        System.out.println("Show Track Ride View");
    }

    @FXML
    private void showCancelRide() {
        System.out.println("Show Cancel Ride View");
    }

    @FXML
    private void showPayForRide() {
        System.out.println("Show Pay for Ride View");
    }

    @FXML
    private void showRateDriver() {
        System.out.println("Show Rate Driver View");
    }
}
