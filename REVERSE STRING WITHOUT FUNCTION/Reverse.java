public class Reverse{
    public static void main(String[] args) {
        String s1 = "Hello World";
        int i = s1.length()-1;
        while(i>=0){
            System.out.print(s1.charAt(i));
            i--;
        }
    }
}