import java.util.*;
public class Main {
    public static void main(String[] args) {
       // find Second Largest
       int[] arr = {12, 35, 1, 10, 34, 1};


       Arrays.sort(arr);

       int max2=arr[arr.length-2];
        System.out.println(max2);

    }
}