class Person{
    int age;
    String name;

    Person(String n,int a){
        age = a;
        name = n;
    }
}

public class PrintDetail1{
    public static void main(String[] args) {
        Person p1 = new Person("USER",18);
        
        System.out.println("NAME = " + p1.name);
        System.out.println("AGE = " + p1.age);
    }
}
