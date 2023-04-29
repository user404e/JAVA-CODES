// simple program for method overloading demonstration

import java.util.Scanner;

class Calculate{
    double radius;
    double length;
    double width;

    void area(double r){
        radius = r;
        System.out.println("CIRCLE AREA = " + (3.141*radius*radius));
    }

    void area(double l,double w){
        length = l;
        width = w;
        System.out.println("RECTANGLE AREA = " + (length*width));
    }
}

public class MethodOverriding2{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculate c1 = new Calculate();

        System.out.print("Enter Rdius Of Circle : ");
        double radius = scan.nextDouble();

        c1.area(radius);

        System.out.print("Enter Length Of Rectangle : ");
        double length = scan.nextDouble();

        System.out.print("Enter Width Of Rectangle : ");
        double width = scan.nextDouble();
        
        c1.area(length, width);
    }
}
