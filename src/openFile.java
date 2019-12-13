import javax.swing.*;
import java.io.*;


public class openFile {




    /**
     * Opens a new Window to choose a File
     */

    static String filepath;

    public static void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnval = fileChooser.showOpenDialog(null);
        if(returnval == JFileChooser.APPROVE_OPTION)
             filepath = fileChooser.getSelectedFile().getAbsolutePath();
        fileChooser.show();
        System.out.println(filepath);
    }


    public static void readFile() {
        StringBuilder stringBuffer = new StringBuilder();
        BufferedReader bufferedReader = null;
        File file = new File("Text.txt");
        String path = "Text.txt";

        try {

            bufferedReader = new BufferedReader(new FileReader(path));

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                stringBuffer.append(text);
                System.out.println(text);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


