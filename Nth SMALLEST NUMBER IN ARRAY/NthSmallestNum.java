import java.util.Arrays;
import java.util.Scanner;
public class NthSmallestNum {
    public static void main(String[] args) {
        int arr[] = {54,984,86,848,4964,4,651,254,0};
        Arrays.sort(arr);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N  : ");
        int nth = scan.nextInt();

        System.out.println(arr[nth-1]);
    }
}
