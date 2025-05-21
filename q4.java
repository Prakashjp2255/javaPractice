import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number<=100) {
            System.out.println("sorry sir you are only enter 100 numbers below ");

        } // if user enter 100 above means it stop only first condition not go else ? what i do 
        else {
            if (number %3 ==0) {
                System.out.println("yes you are divisible by 3 ");
            }
            if (number %5 ==0) {
                System.out.println("yes you are divisible by 3 ");
            }
        }

    }
}

// here you use else if condition
