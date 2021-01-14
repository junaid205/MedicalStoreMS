package module2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;


import java.io.IOException;

public class Medicines_Controller {
    @FXML
    private BorderPane AllView;

    public void AddMedicine(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/AddMedicine.fxml"));
        AllView.setCenter(layout);
    }
}
