package com.example.uber.Shawon_2320246;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewEarningsController {

    @FXML
    private TableView<Earning> tableView;

    @FXML
    private TableColumn<Earning, String> dateColumn;

    @FXML
    private TableColumn<Earning, String> amountColumn;

    @FXML
    private TableColumn<Earning, String> descriptionColumn;

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        ObservableList<Earning> earningsList = FXCollections.observableArrayList(
                new Earning("2024-01-01", "$150.50", "Completed rides"),
                new Earning("2024-01-02", "$200.75", "Bonus"),
                new Earning("2024-01-03", "$100.00", "Cancelled rides")
        );

        tableView.setItems(earningsList);
    }

    public static class Earning {
        private final String date;
        private final String amount;
        private final String description;

        public Earning(String date, String amount, String description) {
            this.date = date;
            this.amount = amount;
            this.description = description;
        }

        public String getDate() {
            return date;
        }

        public String getAmount() {
            return amount;
        }

        public String getDescription() {
            return description;
        }
    }
}
