import javafx.fxml.FXML;

public class Controller {

    @FXML
    public void handleButtonAction(javafx.event.ActionEvent event) {
        Save.saveToFileChooser();
    }
}
