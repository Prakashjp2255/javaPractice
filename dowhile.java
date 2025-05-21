import java.util.Scanner;

class to {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0 ;

        do { 
            System.out.println("enter a number :" + a );
            a = scan.nextInt();
        } while (a<10);
    }
}