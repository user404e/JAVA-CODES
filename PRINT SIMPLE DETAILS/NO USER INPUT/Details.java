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
        Person p1 = new Person();

        p1.setData(18,"6359098084","BHAVYA","GIRNAR SOCIETY OPPOSITE ANKUR VIDHYALAY");
        p1.printData();
    }
}