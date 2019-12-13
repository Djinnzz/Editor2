import javax.swing.filechooser.FileSystemView;

public class Save {

    public static String getStandardPath(){
        return FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
    }


}
