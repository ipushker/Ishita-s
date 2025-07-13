import java.util.*;
public class ArrayInWave {
    void sortInWave(int arr[]){
        
        int n = arr.length;
        
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    // Driver method
    public static void main(String args[]){
        
        ArrayInWave ob = new ArrayInWave();
        int arr[] = {1, 2, 3, 4, 5};
        ob.sortInWave(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
