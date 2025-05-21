package Sortings;

public class selection {

    public static void main (String[] args){
         
    int arr[] = {9,7,10,2,6,9};
    int size = arr.length;
    int temp ;
    int min = -1 ;

    System.out.println("BEFORE SORTING ");
    for (int s:arr){
        System.out.print(s + " ");
    }

    System.out.println();

    // select one no and compare that was biggest or not 
    for (int i=0; i<size-1;i++){
        min = i;
        for (int j=i+1; j<size; j++) {
            if (arr[j] <arr[min]) {
                min = j ;
            }
        }
        temp = arr[min];
        arr[min] = arr [i] ;
        arr [i] = temp ;

    }

    System.out.println("AFTER SORTING ");
    for (int s: arr){
        System.out.print(s + " ");
    }

    }
   
}
