import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {

        int[] arr = {4,23,23,24,1,324,2,525,3};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]);
        
    }
}
