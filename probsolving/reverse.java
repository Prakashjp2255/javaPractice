package probsolving;

public class reverse {
    static int[] rev_array (int[] arr){

        // Reverse a given Array
        // Input: N = 5, arr[] = {5,4,3,2,1}
        // Output: {1,2,3,4,5}
        
        int l = 0 , r = arr.length -1 ;

        while (l<r){

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return arr;
    }

    public static void main (String[] args){
        int arr[] = {23,33,44,55,77};
        int[] rev = rev_array(arr);
        System.out.print("The reversed Array is : \n");
        for(int s: rev){
            System.out.print(s + " ");
        }
    }
}
