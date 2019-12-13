import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;


public class openFile
{


    public static void openFile()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wähle die Datei");
        fileChooser.showOpenDialog(null);
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*")
        );





    }
}


