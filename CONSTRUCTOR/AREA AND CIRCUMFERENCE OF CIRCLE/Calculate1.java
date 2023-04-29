class Circle{
    double radius;
    Circle(double r){
        radius = r;

        System.out.println("AREA = " + (3.141 * radius * radius));
        System.out.println("CIRCUMFERENCE = " + (2 * 3.141 * radius));
    }
}

public class Calculate1{
    public static void main(String[] args) {
        Circle c1 = new Circle(12.43);
    }
}
