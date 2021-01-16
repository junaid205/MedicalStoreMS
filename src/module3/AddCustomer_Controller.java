package module3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AddCustomer_Controller {
    @FXML
    private BorderPane AllView;

    public void ManageCustomer(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/Customer.fxml"));
        AllView.setCenter(layout);
    }
}
