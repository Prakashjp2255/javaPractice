import java.util.Scanner;

public class banking {
    //banking problem 
    
    static Scanner scan = new Scanner(System.in);
    public static void main (String[]  args){

        //declare variables

        double balance = 0 ;
        boolean isRunning = true ;
        int choice ;

        //display menu

        while (isRunning){
            System.out.println("********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*******************");
            System.out.println("CHOOSE YOUR CHOICE ");
            System.out.println(" (1.) SHOW BALANCE ");
            System.out.println(" (2.) DEPOSIT  ");
            System.out.println(" (3.) WITHDRAW  ");
            System.out.println(" (4.) EXIT ");
            System.out.println("********************");
            //get and process user choice

            System.out.print("ENTER YOUR CHOICE (1-4): " );
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("YOUR BANK BALANCE: ");
                showBalance(balance);
                System.out.println();
            }else if (choice == 2){
                balance = balance + deposit() ;
            } else if (choice==3) {
                balance = balance - withdraw(balance);
            } else if (choice ==4 ) {
                isRunning = false;
                System.out.println("EXIT");
            }else {
                System.out.println("INVALID CHOICE");
            }
        }

    }

        //showbalance()
    static void showBalance(double balance){
        System.out.printf( "$%.2f" , balance);
    }
        //deposit()
    static double deposit(){
        double amount ;
        System.out.println("ENTER A AMOUNT TO BE DEPOSITED :   ");
        amount = scan.nextDouble();

        if (amount<0){
            System.out.println("SORRY AMOUNT CANT BE NEGATIVE");
            return 0 ;
        }else {
            return amount ;
        }

    }
        //withdraw()
    static double withdraw (double balance){
        double amount ;

        System.out.println("ENTER A AMOUNT TO WITHDRAW : ");
        amount = scan.nextDouble();

        if (balance < amount) {
            System.out.println("INSUFFISIENT FUNDS");
            return  0;
        }else if (amount < 0 ){
            System.out.println("AMOUNT CANT BE NEGATIVE");
            return 0;
        }
        return amount ;
    }
}
