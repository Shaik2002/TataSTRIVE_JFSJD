import java.io.File;
import java.io.FileReader;

public class P8_Checked_FileNotFoundException
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("C://file.txt");
        FileReader fileReader = new FileReader(file);
    }
}