// takes 2 integer from user and print their sum and products 

import java.util.Scanner;

public class UserInputSumAndProduct {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st Integer Number : ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter 2nd Integer Number : ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("SUM = " + sum);
        System.out.println("PRODUCT = " + product);
    }
    
}
