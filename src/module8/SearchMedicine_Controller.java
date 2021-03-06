package module8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class SearchMedicine_Controller {
    @FXML
    private BorderPane AllView;

    public void SearchCustomer(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module8/SearchCustomer.fxml"));
        AllView.setCenter(layout);
    }

    public void SearchPurchase(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module8/SearchPurchase.fxml"));
        AllView.setCenter(layout);
    }
}
