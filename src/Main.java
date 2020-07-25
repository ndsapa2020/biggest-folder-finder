import java.io.File;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {
        String folderPath = "D://Media";
        File file  = new File(folderPath);

        System.out.println(file.length());
    }
}
