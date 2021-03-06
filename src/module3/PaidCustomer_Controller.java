package module3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class PaidCustomer_Controller {
    @FXML
    private BorderPane AllView;

    public void ManageCustomer(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/Customer.fxml"));
        AllView.setCenter(layout);
    }

    public void CustomerLedger(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/CustomerLedger.fxml"));
        AllView.setCenter(layout);
    }

    public void CreditCustomer(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/CreditCustomer.fxml"));
        AllView.setCenter(layout);
    }
}
