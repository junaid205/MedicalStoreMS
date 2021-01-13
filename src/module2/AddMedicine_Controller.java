package module2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddMedicine_Controller {
    @FXML
    private Button Exit_Btn;

    public void Close(ActionEvent actionEvent) {
        ((Stage) Exit_Btn.getScene().getWindow()).close();
    }
}
