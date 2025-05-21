import java.util.Scanner;
class arr2 {
    public static void main(String[] args) {
        // get input for 5 nums using arr and for loop 

        int [] digit = new int[5];
        Scanner scan = new Scanner(System.in);

        for ( int count=0 ; count<=digit.length ; count++){
            digit[count] = scan.nextInt();

        }
        for ( int count=0 ; count<=digit.length ; count++){
            System.out.println(digit[count]);

        }
    }
}