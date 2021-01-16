package module1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Dashboard_Controller {
    @FXML
    private BorderPane AllView;

    public void TotalMedicine(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/Medicines.fxml"));
        AllView.setCenter(layout);
    }

    public void TotalCustomer(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module3/Customer.fxml"));
        AllView.setCenter(layout);
    }

    public void OutOfStock(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module5/Stock.fxml"));
        AllView.setCenter(layout);
    }

    public void Expired(MouseEvent mouseEvent) {
    }

    public void Invoice(MouseEvent mouseEvent) {
    }
}
