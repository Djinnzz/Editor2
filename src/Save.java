/**
 * Save.java saves the content to a choosen file
 * */

import javax.swing.filechooser.FileSystemView;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Save {


    /**
     * returns the standart documents path as a String
     * */

    public static String getStandardPath(){
        return FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
    }

    /**
     * saves the arguments to a file
     * */

    public static void saveToFile(Path filePath, String fileName, String content){

        // creation Writer
        BufferedWriter writer = null;
        String completePath = filePath + fileName;

        try {

            writer = new BufferedWriter(new FileWriter(completePath));
            writer.write(content);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
