package module2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AddCategory_Controller {
    @FXML
    private BorderPane AllView;

    public void ManageCategory(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/Category.fxml"));
        AllView.setCenter(layout);
    }

    public void ManageMedicine(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/Medicines.fxml"));
        AllView.setCenter(layout);
    }
}
