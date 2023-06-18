abstract class abs{
    abstract void printdata();

    void show(){
        System.out.println("Hello");
    }
}

class demo extends abs{
    void printdata(){
        System.out.println("World");
    }
}

public class AbstractClass2 {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.show();
        d1.printdata();
    }
}