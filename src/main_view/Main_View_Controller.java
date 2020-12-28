package main_view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main_View_Controller {
    public BorderPane allView;

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void dashboard(ActionEvent actionEvent) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/module1/Dashboard.fxml"));
        allView.setCenter(pane);
    }

    public void purchase(ActionEvent actionEvent) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/module2/Purchase.fxml"));
        allView.setCenter(pane);
    }
}
