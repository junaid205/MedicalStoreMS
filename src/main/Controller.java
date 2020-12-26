package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public Button login_btn;

    public void login(ActionEvent actionEvent) throws IOException {
        ((Stage) login_btn.getScene().getWindow()).close();
        Login_Click();
    }

    public void Login_Click() throws IOException {
        Parent Layout = FXMLLoader.load(getClass().getResource("/module1/dashboard.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(Layout));
        stage.setMaximized(true);
        stage.setTitle("Pharmacy Management");
        stage.show();
    }
}
