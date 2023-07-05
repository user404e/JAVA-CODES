import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;
import java.net.URLEncoder;
import java.net.URISyntaxException;

public class Browse {
    public static void main(String[] args) {
        try {

            Scanner scan = new Scanner(System.in);

            System.out.print("Search Google : ");

            String search = scan.next();
            search += scan.nextLine();

            
            String query = URLEncoder.encode(search,"UTF-8");
            URI url = new URI("https://www.google.com/search?q=" + query);
            
            Desktop d = Desktop.getDesktop();
            d.browse(url);
            
        } catch (URISyntaxException e) {

            System.out.println("URISyntaxException: " + e.getMessage());
        } catch (IOException e) {

            System.out.println("IOException: " + e.getMessage());
        }
    }
}