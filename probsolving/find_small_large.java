package probsolving;

import java.util.Arrays;

public class find_small_large {
     public static void main (String[] args){

        int arr[] ={3,9,2,10,18,1} ;
        int min = arr[0];
        int max = arr[0];
        int size = arr.length;

        System.out.println("THE ARRAY IS :");
        for (int s:arr){
            System.out.print(s + " ");
        }

        for (int i=0;i<size;i++){
            if(min > arr[i]) {
                min = arr[i] ;
            }else if (max < arr[i]){
                max = arr[i];
            }
        }
        sorting (arr);

        System.out.println();
        System.out.println("SORTED ARRAY ");
        for (int s : arr){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("THE SMALLEST ELEMENT IN ARRAY IS : " + min);
        System.out.print("THE LARGEST ELEMENT IN ARRAY IS  : " + max);

    }

    static void sorting(int arr[]){
        Arrays.sort(arr);
    }
    
}
