import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args){
        // JAVA DICE ROLLER PROGRAM

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numOfDice ;
        int total = 0;

        System.out.println("ENTER THE # OF DICE TO ROLL : ");
        numOfDice = scan.nextInt();

        if (numOfDice > 0){

            for (int i=0;i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                printDice(roll);
                System.out.println("YOU ROLLED :" + roll) ;
                total = roll + total ;
            }
            System.out.println("YOUR TOTAL NO OF DICE ROLL :"+ total) ;

        }else{
            System.out.println("INVALID VALUE OR DICE GREATER THAN 0");
        }
    }
    static void printDice(int roll) {

        String dice1 = """
                =========
               |         |
               |         |
               |    ●    |
               |         |
               |         |
                =========
                """ ;

        String dice2 = """
                =========
               |    ●    |
               |         |
               |         |
               |         |
               |    ●    |
                =========
                """ ;

        String dice3  = """
                =========
               |    ●    |
               |         |
               |    ●    |
               |         |
               |    ●    |
                =========
                """ ;

        String dice4 = """
                =========
               | ●     ● |
               |         |
               |         |
               |         |
               | ●     ● |
                =========
                """ ;

        String dice5= """
                =========
               | ●     ● |
               |         |
               |    ●    |
               |         |
               | ●     ● |
                =========
                """ ;

        String dice6 = """
                 =========
               | ●     ● |
               |         |
               | ●     ● |
               |         |
               | ●     ● |
                =========
                """ ;

        if (roll==1){
            System.out.println(dice1);
        }else if (roll==2){
            System.out.println(dice2);
        } else if (roll==3) {
            System.out.println(dice3);
        } else if (roll==4) {
            System.out.println(dice4);
        } else if (roll==5) {
            System.out.println(dice5);
        } else if (roll==6) {
            System.out.println(dice6);
        } else {
            System.out.println("INVALID ROLL");
        }
    }
}
