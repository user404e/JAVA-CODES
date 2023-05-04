class Circle{
    double radius,area,circumference;
    Circle(double r){
        radius = r;

        area =  3.141 * radius * radius;
        circumference = 2 * 3.141 * radius;
    }
}

public class Calculate2{
    public static void main(String[] args) {
        Circle c1 = new Circle(12.43);

        System.out.println("AREA = " + c1.area);
        System.out.println("CIRCUMFERENCE = " + c1.circumference);
    }
}