package probsolving;

import java.util.Arrays;

//k-th sallest element in 
//arr[] = {7,10,4,3,20,15}; k = 3 o/p => 7 

public class kth_small {
     public static void main (String [] args) {
        int arr [] = {7,10,4,3,20,15};
        int k = 3 ;
        int temp;
        Arrays.sort(arr);

        System.out.println("The kth small element are : " + arr[k-1]);
    }
}
