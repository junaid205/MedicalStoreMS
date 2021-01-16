package module4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AddPurchase_Controller {
    @FXML
    private BorderPane AllView;

    public void ManagePurchase(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module4/Purchase.fxml"));
        AllView.setCenter(layout);
    }
}
