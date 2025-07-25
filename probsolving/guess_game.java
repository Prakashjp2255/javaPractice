
package probsolving;

import java.awt.*;
import java.util.*;


public class guess_game {
   




    public static void main (String [] args) {
        //guess the word
        // i gave one
        // --> get user input
        // --> if they match they win


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("  Welcome to word Game ");
        System.out.println("  Find the word if the word guessing is right !   ");
        System.out.println("  You'll get a point   ");
        System.out.println();
        System.out.println("  Press 1 to start a game .....");
        System.out.println();

        int a = scan.nextInt();
        int count = 0 ;

        while (a == 1 ){

            String ans[] = {"FARM", "PLUG" , "SEA" , "NIPPON" , "HARM"};

            System.out.println(".....Ok lets start the game.....");

            String ques[] = {" What's your guess   F _ _ _   ?  " ,
                             " What's your guess   P _ _ _   ?  " ,
                             " What's your guess   S _ _    ?  " ,
                             " What's your guess   N _ P _ O _   ?  ",
                             " What's your guess   H _ _ _   ?  "};

            String s = scan.nextLine();
            String temp = s.toUpperCase();

            for (int i =0 ;i<ques.length; i++ ){
                
            }


            for(int i = 0 ; i<ans.length; i++){
                if (temp == ans[i]){
                    count++ ;
                }
            }
            System.out.println("yeah you ");


        }
        String s = scan.nextLine();

    }
}

