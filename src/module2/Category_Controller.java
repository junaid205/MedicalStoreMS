package module2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Category_Controller {
    @FXML
    private BorderPane AllView;

    public void ManageMedicine(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/Medicines.fxml"));
        AllView.setCenter(layout);
    }

    public void AddCategory(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/AddCategory.fxml"));
        AllView.setCenter(layout);
    }
}
