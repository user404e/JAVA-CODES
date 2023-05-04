import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int a = scan.nextInt();

        System.out.print("Enter 2nd Number : ");
        int b = scan.nextInt();
        
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
