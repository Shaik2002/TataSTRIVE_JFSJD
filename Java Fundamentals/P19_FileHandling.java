import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Paths.get;

public class P19_FileHandling {
    public static void main(String[] args) throws IOException {
        String fileName = "FileHandling.html";
        File file = new File(fileName);
        if (file.createNewFile())
        {
            System.out.println("File Created Successfully!");
        }
        else
        {
            System.out.println("File already exists, failed to create new file");
        }
    }
}
