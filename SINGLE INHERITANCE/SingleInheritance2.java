class Arithmetic{
    
    int add(int num1,int num2){
        return num1 + num2;
    }
}
class Adder extends Arithmetic{
    
}
//Write your code here

public class SingleInheritance2{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
