package module7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AddSupplier_Controller {
    @FXML
    private BorderPane AllView;

    public void ManageSupplier(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module7/Supplier.fxml"));
        AllView.setCenter(layout);
    }
}
