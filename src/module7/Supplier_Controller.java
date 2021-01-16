package module7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Supplier_Controller {
    @FXML
    private BorderPane AllView;

    public void AddSupplier(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module7/AddSupplier.fxml"));
        AllView.setCenter(layout);
    }

    public void SupplierLedger(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module7/SupplierLedger.fxml"));
        AllView.setCenter(layout);
    }
}
