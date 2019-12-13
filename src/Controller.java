import javafx.fxml.FXML;
<<<<<<< HEAD

public class Controller {

    @FXML
    public void handleButtonAction(javafx.event.ActionEvent event) {
        Save.saveToFileChooser();
    }
=======
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller
{
    public void listenOpen()
    {
        openFile.openFile();
    }


>>>>>>> master
}
