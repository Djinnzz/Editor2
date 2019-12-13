import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
<<<<<<< HEAD
=======
import javafx.fxml.FXML;
import javafx.scene.control.Button;
>>>>>>> master

public class Close{

    @FXML
    private Button Close;

<<<<<<< HEAD
   @FXML
    public void initialize() {
=======
    @FXML
    private void initialize() {
        
>>>>>>> master
        Close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit();
            }
        });

    }
}

