import javafx.stage.FileChooser;

import java.io.File;


public class openFile
{


    /**
     * Opens a new Window to choose a File
     */
    public static void openFile()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wähle die Datei");
        fileChooser.showOpenDialog(null);
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("HTML Files", "*.htm")
        );





    }
}


