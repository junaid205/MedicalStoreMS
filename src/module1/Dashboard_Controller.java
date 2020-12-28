package module1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard_Controller {


    public void Medicines(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module1/Medicines.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.show();
    }
    public void SaleOfDay(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module1/SaleOfDay.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.show();
    }
    public void SaleOfMonth(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module1/SaleOfMonth.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.show();
    }
    public void StockStorage(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module1/StockStorage.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.show();
    }
    public void ExpiredProducts(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module1/ExpiredProducts.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.show();
    }
    public void NearExpiry(MouseEvent mouseEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module1/NearToExpiry.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.show();
    }
}
