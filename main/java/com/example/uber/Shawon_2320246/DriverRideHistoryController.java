package com.example.uber.Shawon_2320246;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DriverRideHistoryController {

    @FXML
    private TableView<Ride> rideTableView;

    @FXML
    private TableColumn<Ride, String> passengerColumn;

    @FXML
    private TableColumn<Ride, String> dateColumn;

    @FXML
    private TableColumn<Ride, Double> fareColumn;

    @FXML
    public void initialize() {
        passengerColumn.setCellValueFactory(cellData -> cellData.getValue().passengerProperty());
        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        fareColumn.setCellValueFactory(cellData -> cellData.getValue().fareProperty().asObject());


        rideTableView.getItems().add(new Ride("Alice", "2024-01-01", 15.50));
        rideTableView.getItems().add(new Ride("Bob", "2024-01-02", 20.75));
        rideTableView.getItems().add(new Ride("Charlie", "2024-01-03", 10.00));
    }

    public static class Ride {
        private final SimpleStringProperty passenger;
        private final SimpleStringProperty date;
        private final SimpleDoubleProperty fare;

        public Ride(String passenger, String date, double fare) {
            this.passenger = new SimpleStringProperty(passenger);
            this.date = new SimpleStringProperty(date);
            this.fare = new SimpleDoubleProperty(fare);
        }

        public String getPassenger() {
            return passenger.get();
        }

        public SimpleStringProperty passengerProperty() {
            return passenger;
        }

        public String getDate() {
            return date.get();
        }

        public SimpleStringProperty dateProperty() {
            return date;
        }

        public double getFare() {
            return fare.get();
        }

        public SimpleDoubleProperty fareProperty() {
            return fare;
        }
    }
}
