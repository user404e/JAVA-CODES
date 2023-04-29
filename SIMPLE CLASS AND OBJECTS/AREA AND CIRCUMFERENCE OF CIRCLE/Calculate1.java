class Circle{
    double radius,area,circumference;

    void area(double r){
        radius = r;

        area = 3.14 * radius * radius;

        System.out.println("AREA = " + area);
    }

    void circumference(double r){
        radius = r;

        circumference = 2 * 3.141 * r;

        System.out.println("CIRCUMFERENCE = " + circumference);
    }
}

public class Calculate1{
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.area(12.20);
        c1.circumference(42.23);
    }
}
