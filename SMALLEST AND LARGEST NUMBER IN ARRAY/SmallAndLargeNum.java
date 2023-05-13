import java.util.Arrays;

public class SmallAndLargeNum {
    public static void main(String[] args) {
        
        int[] arr = {11,2,323,24,2000,45,21,5,243,-21,42,53};

        Arrays.sort(arr);

        int smallestnum = arr[0];
        int largestnum = arr[arr.length-1];

        System.out.println("SMALLEST NUM IN ARRAY = " + smallestnum);
        System.out.println("LARGEST NUM IN ARRAY = " + largestnum);

    }
}
