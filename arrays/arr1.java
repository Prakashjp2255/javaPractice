import java.util.Scanner;
class arr1  {
    public static void main(String[] args) {
        //Create an integer array, Get input for 5 numbers and print their sum or total.

        int [] number = new int[5];
        Scanner scan = new Scanner(System.in);

        number [0] = scan.nextInt();
        number [1] = scan.nextInt();
        number [2] = scan.nextInt();
        number [3] = scan.nextInt();
        number [4] = scan.nextInt();
        System.out.println( number[0] + number[1] + number[2] + number[3] + number[4]);


    }
}




