class Circle{
    double radius,area,circumference;

    void cal(double r){
        radius = r;
        area = 3.14 * radius * radius;
        circumference = 2 * 3.141 * r;
    }
}

public class Calculate2{
    public static void main(String[] args) {
        
        Circle c1 = new Circle();

        c1.cal(12.20);

        System.out.println("AREA = " + c1.area);
        System.out.println("CIRCUMFERENCE = " + c1.circumference);

    }
}
