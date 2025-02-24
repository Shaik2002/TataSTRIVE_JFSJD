import java.io.File;
public class P20_FileHandling_Operations {
    public static void main(String[] args) {
        File file = new File("Example.txt");
        if(file.exists()){
            if (file.delete()){
                System.out.println("File Deleted Successfully!");
            }
            else {
                System.out.println("Failed to Delete the File!");
            }
        }
        else {
            System.out.println("File Doesn't Exists");
        }
    }
}