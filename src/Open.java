import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;

public class Open extends Application
{
    @FXML
    private Button Open;
    private Desktop desktop = Desktop.getDesktop();


    public void start(Stage stage)
    {
        final FileChooser fileChooser = new FileChooser();

        Open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                File file = fileChooser.showOpenDialog(stage);
                if(file != null)
                {
                    Open(file)
                }
            }
        });
    }



}
