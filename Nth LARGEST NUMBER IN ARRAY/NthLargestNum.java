import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNum{
    public static void main(String[] args) {

        int arr[] = {32,4234,5,436,546,35,323,45};

        Arrays.sort(arr);

        System.out.print("Enter N : ");

        Scanner scan = new Scanner(System.in);
        int nth = scan.nextInt();

        System.out.println(arr[arr.length-nth]);
    }
}