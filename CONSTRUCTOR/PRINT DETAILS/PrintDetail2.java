class Person{
    int age;
    String name;

    Person(String n,int a){
        age = a;
        name = n;

        System.out.println("NAME = " + name);
        System.out.println("AGE = " + age);
    }
}

public class PrintDetail2{
    public static void main(String[] args) {
        Person p1 = new Person("USER",18);
    }
}