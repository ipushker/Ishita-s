import java.util.*;
public class ProductOfThreeMaximumNumbersUsingSorting {
    static int maxProduct(int[]arr){
        int n=arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1],arr[n-1]*arr[n-2]*arr[n-3]);
       }
       public static void main(String [] args){
        int arr[]={-10,-3,5,6,-20};
        System.out.println(maxProduct(arr));
       }
}
