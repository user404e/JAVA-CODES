public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        int fact = 1;
        while(count<=num){
            fact *= count;
            count ++;
        }
        System.out.println(fact);
    }
}
