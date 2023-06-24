final class abs{

    int a = 10;
    void show(){
        System.out.println(a);
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