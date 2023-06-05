public class Demo {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        int count = 1;
        while(count<=num){
            fact = fact * count;
            count ++;
        }
        System.out.println(fact);
    }
}
