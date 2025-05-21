package pattern;

import java.util.Scanner;

class pat1 {
    public static void main(String[] args) {
        // star pattern for square 
        // for (int i=0 ; i<=5 ; i++)
        // {
        //     for (int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if ( a > 10)
        {
            System.out.println("re-enter");
        }

    }
}


