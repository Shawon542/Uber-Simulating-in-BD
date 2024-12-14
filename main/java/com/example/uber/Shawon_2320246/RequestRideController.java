package com.example.uber.Shawon_2320246;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class RequestRideController {

    @FXML
    private TextField pickupField;

    @FXML
    private TextField destinationField;

    @FXML
    private TableView<Driver> tableView;

    @FXML
    private TableColumn<Driver, String> driverNameColumn;

    @FXML
    private TableColumn<Driver, String> vehicleColumn;

    @FXML
    private TableColumn<Driver, Double> ratingColumn;

    private ObservableList<Driver> driverList;

    @FXML
    public void initialize() {

        driverNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("vehicle"));
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));

        driverList = FXCollections.observableArrayList(
                new Driver("Safin", "Toyota Prius", 4.5),
                new Driver("Niloy", "Honda Civic", 4.8),
                new Driver("Rafi", "Esquire", 4.3)
        );


        tableView.setItems(driverList);
    }

    @FXML
    private void checkAvailability() {
        String pickup = pickupField.getText();
        String destination = destinationField.getText();

        if (pickup.isEmpty() || destination.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Incomplete Information");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in both the pickup and destination locations.");
            alert.showAndWait();
        } else {
            tableView.setItems(driverList);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Availability Checked");
            alert.setHeaderText(null);
            alert.setContentText("Available drivers are listed.");
            alert.showAndWait();
        }
    }

    public static class Driver {
        private final String name;
        private final String vehicle;
        private final Double rating;

        public Driver(String name, String vehicle, Double rating) {
            this.name = name;
            this.vehicle = vehicle;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public String getVehicle() {
            return vehicle;
        }

        public Double getRating() {
            return rating;
        }
    }
}

