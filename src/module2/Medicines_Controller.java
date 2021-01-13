package module2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Medicines_Controller {

    public void AddMedicine(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module2/AddMedicine.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
}
