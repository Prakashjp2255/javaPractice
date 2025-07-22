package probsolving;

import java.util.Arrays;

// Rearrange array in increasing-decreasing order
// Output: 1 5 6 9 8 7

public class rearrange {
    public static  void  main (String[] args){

        int arr[] ={8,7,1,6,5,9};
        int mid = arr.length / 2;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=0;i<mid; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i=n-1 ; i>=mid ; i--){
            System.out.print(arr[i] + " " );
        }
        
    }
}
