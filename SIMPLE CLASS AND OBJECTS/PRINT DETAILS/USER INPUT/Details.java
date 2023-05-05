import java.util.Scanner;

class Person{
    int age;
    String phoneNumber;
    String name,address;

    void setData(int age,String phoneNumber,String name,String address){
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.name=name;
        this.address=address;
    }

    void printData(){
        System.out.println("NAME = " + name);
        System.out.println("AGE = " + age);
        System.out.println("PHONE NUMBER = " + phoneNumber);
        System.out.println("ADDRESS = " + address);
    }
}

public class Details{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person();

        System.out.print("ENTER YOUR NAME : ");
        String name= scan.next();

        System.out.print("ENTER YOU AGE : ");
        int age = scan.nextInt();

        System.out.print("ENTER YOUR PHONE NUMBER : ");
        String phoneNumber= scan.next();

        System.out.print("ENTER YOUR ADDRESS : ");
        String address= scan.nextLine();
        address+=scan.nextLine();

        p1.setData(age,phoneNumber,name,address);

        p1.printData();
    }
}