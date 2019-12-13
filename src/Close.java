import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
<<<<<<< Updated upstream
import javafx.fxml.FXML;
import javafx.scene.control.Button;
=======

import javafx.fxml.FXML;
import javafx.scene.control.Button;


>>>>>>> Stashed changes
public class Close{

    @FXML
    private Button Close;

    @FXML
    private void initialize() {
<<<<<<< Updated upstream
=======
        
>>>>>>> Stashed changes

        Close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit();
            }
        });

    }
}

