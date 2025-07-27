import java.util.Scanner;

class arr4 {
    public static void main(String[] args) {
        // • Get Input for size on array
        //  • Get input for each element in an array
        //  • Find and print middle element in an array.

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] num = new int[size] ;

        for ( int  i=0 ; i<=size -1 ; i++) { 
            num[i] = scan.nextInt();
        }

        
        int abc = num.length;  //  here how you find middle element is , 1 find lenth of array ,2 next len/2 , 3 you have to find the array is div by 2 ==1 means find the odd , 
        int xyz = abc/2 ; 

        if (xyz%2==1) {
            System.out.println("yeah the middle array is " + num[xyz]);
        }

        else {
            System.out.println("yeah the middle array is " + num [xyz]);
        }

    
    }
}   