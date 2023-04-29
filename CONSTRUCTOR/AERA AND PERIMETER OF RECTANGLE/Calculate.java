class Rectangle{

    double area,perimeter,height,width;

    Rectangle(double h,double w){
        height = h;
        width = w;
        area = height * width;
        perimeter = 2 * ( height * width);

        System.out.println("AREA = " + area);
        System.out.println("PERIMETER = " + perimeter);
    }
}

public class Calculate{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,5);
    }
}
