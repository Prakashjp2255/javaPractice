package Sortings;

public class bubble {
    // make a array to sorting
    
    public static void main (String[] args){
         int arr[] = {5,2,4,6,2,8,11};
    int size = arr.length;
    int temp; 
    
    System.out.println("BEFORE SORTING BUBBLE SORT:");
        for (int s : arr) {
            System.out.print(s + " ");
        }

    System.out.println();
    
    for (int i=0; i<size; i++){
        for (int j=0; j<size-1; j++){
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp ;
            }
        }
        System.out.println("AFTER SORTING BUBBLE SORT " );
        for (int s : arr){
            System.out.println(s + " " );    
        }
    }

    }
   
}
