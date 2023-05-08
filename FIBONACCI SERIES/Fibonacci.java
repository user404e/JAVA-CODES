public class Fibonacci {
    public static void main(String[] args) {
        int n= 7;
        int n1=0,n2=1,count=1,n3=0;
        while(count<=n){
            System.out.println(n3);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count ++;
        }
    }
}
