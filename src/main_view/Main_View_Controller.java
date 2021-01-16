package main_view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main_View_Controller  {
    public BorderPane allView;
    @FXML

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void dashboard(ActionEvent actionEvent) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/module1/Dashboard.fxml"));
        allView.setCenter(pane);
    }

    public void Medicine(ActionEvent actionEvent) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/module2/Medicines.fxml"));
        allView.setCenter(pane);
    }

    public void Customer(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/Customer.fxml"));
        allView.setCenter(layout);
    }

    public void Purchase(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module4/Purchase.fxml"));
        allView.setCenter(layout);
    }

    public void Stock(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module5/Stock.fxml"));
        allView.setCenter(layout);
    }

    public void Report(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module6/Report.fxml"));
        allView.setCenter(layout);
    }

    public void Supplier(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module7/Supplier.fxml"));
        allView.setCenter(layout);
    }

    public void Search(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module8/SearchMedicine.fxml"));
        allView.setCenter(layout);
    }

    public void Setting(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module9/Setting.fxml"));
        allView.setCenter(layout);
    }

    public void TotalMedicine(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/Medicines.fxml"));
        allView.setCenter(layout);
    }

    public void TotalCustomer(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/Customer.fxml"));
        allView.setCenter(layout);
    }

    public void OutOfStock(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module5/Stock.fxml"));
        allView.setCenter(layout);
    }

    public void Expired(MouseEvent mouseEvent) {
    }

    public void Invoice(MouseEvent mouseEvent) {
    }
}