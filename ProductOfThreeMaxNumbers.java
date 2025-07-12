import java.util.*;
public class ProductOfThreeMaxNumbers {
    static int maxProduct(int[]arr){
        int n=arr.length;
        int max_product=0;
        for(int i=0;i<n-2;i++)
            for (int j=i+1;j<n-1;j++)
                for(int k=j+1;k<n;k++)
                    max_product=Math.max(max_product,arr[i]*arr[j]*arr[k]);
                    return max_product;
                
            
        
    }
    public static void main(String[] args){
        int arr[]={10,3,5,6,20};
        System.out.println(maxProduct(arr));
    }
}
