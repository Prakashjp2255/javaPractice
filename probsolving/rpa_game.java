package probsolving;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rpa_game{
    public static void main(String[] args){

        boolean isRunning = true;

        int total =0 ;
        String playagain = "yes";
        String audience ;
        int comp_choice;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("HI ! RPS GAME ");
            System.out.print("ENTER YOUR CHOICE (ROCK,PAPER,SCISSOR):");
            audience = scan.nextLine().toLowerCase();

            Random random = new Random();


            comp_choice = random.nextInt(3) +1;
            String compchoicestr = " ";

            if (comp_choice==1){
                compchoicestr ="rock";
            } else if (comp_choice==2) {
                compchoicestr ="paper";
            } else{
                compchoicestr ="scissors";
            }

            System.out.print("COMPUTER CHOICE:" + compchoicestr + "\n");

            if (audience.equals(compchoicestr)){
                System.out.println("match tie ");

            } if (audience.equals(compchoicestr)){
                System.out.println("match tie ");

                } else if ((audience.equals("rock") && compchoicestr.equals("scissors")) ||
                    (audience.equals("paper") && compchoicestr.equals("rock")) ||
                    (audience.equals("scissors") && compchoicestr.equals("paper"))) {
                System.out.println("you win !");
                total ++;
                System.out.println("YOUR SCORE" + total);
            }
            else {
                System.out.println("sorry ! better luck next time ");
            }
            System.out.println("ARE YOU WANT TO PLAY AGIAN (yes/no) :");
            audience = scan.nextLine();

        }while (audience.equals("yes"));


    }
}
