import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling1{
    public static void main(String[] args) {

        try {
            File fileobj = new File("Data.txt");
            Scanner scan = new Scanner(fileobj);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }
    }
}