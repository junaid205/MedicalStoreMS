package module4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Purchase_Controller {
    @FXML
    private BorderPane AllView;

    public void AddPurchase(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module4/AddPurchase.fxml"));
        AllView.setCenter(layout);
    }
}
