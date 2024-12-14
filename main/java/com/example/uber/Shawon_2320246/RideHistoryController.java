package com.example.uber.Shawon_2320246;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class RideHistoryController {

    @FXML
    private TableView<Ride> tableView;

    @FXML
    private TableColumn<Ride, String> dateColumn;

    @FXML
    private TableColumn<Ride, String> driverColumn;

    @FXML
    private TableColumn<Ride, String> costColumn;

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        driverColumn.setCellValueFactory(new PropertyValueFactory<>("driver"));
        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));

        ObservableList<Ride> rideList = FXCollections.observableArrayList(
                new Ride("2024-01-01", "Safin", "$15.50"),
                new Ride("2024-01-02", "Niloy", "$20.75"),
                new Ride("2024-01-03", "Rafi", "$10.00")
        );

        tableView.setItems(rideList);
    }

    public static class Ride {
        private final String date;
        private final String driver;
        private final String cost;

        public Ride(String date, String driver, String cost) {
            this.date = date;
            this.driver = driver;
            this.cost = cost;
        }

        public String getDate() {
            return date;
        }

        public String getDriver() {
            return driver;
        }

        public String getCost() {
            return cost;
        }
    }
}

