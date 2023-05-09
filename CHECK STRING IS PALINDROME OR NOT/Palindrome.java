public class Palindrome{
    public static void main(String[] args) {
        String s1 = "HAH";
        char[] c1 = new char[s1.length()];
        int i = s1.length()-1;
        int j=0;
        while(i>=0){
            c1[j] = s1.charAt(i);
            i--;
            j++;
        }
        String s2 = new String(c1);
        if(s1.equals(s2)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
        
    }
}