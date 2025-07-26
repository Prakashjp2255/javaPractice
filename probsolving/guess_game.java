
package probsolving;

import java.util.*;


public class guess_game {
   
public static void main (String [] args) {
        //guess the word
        // i gave one
        // --> get user input
        // --> if they match they win


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("  Welcome to word Game ".toUpperCase());
        System.out.println("  Find the word if the word guessing is right !   ".toUpperCase());
        System.out.println("  You'll get a point   ".toUpperCase());
        System.out.println();
        System.out.println("  Press 1 to start a game .....".toUpperCase());
        System.out.println();

        int a = scan.nextInt();
        int count = 0 ;

        while (a == 1 ){

            String ans[] = {"FORK", "PLAN" , "SEA" , "HAPPY" , "BOOKS"};

            String ques[] = {" What's your guess   F _ _ K   ?  " ,
                    " What's your guess   P _ _ N   ?  " ,
                    " What's your guess   S E _    ?  " ,
                    " What's your guess   H _ _ _ Y   ?  ",
                    " What's your guess   B O O _ S  ?  "};

            Random random = new Random();

            System.out.println(".....Ok lets start the game....." .toUpperCase());



            String s = scan.nextLine();
            String temp = s.toUpperCase();

            for (int i =0 ;i<ans.length; i++ ){
                System.out.println(ques[i]);
                System.out.println(" Enter your answer : ".toUpperCase());
                String answer = scan.nextLine();
                String temp1  = answer.toUpperCase();

                if(Objects.equals(temp1 ,ans[i])){
                    System.out.println( " ۞ ۞ Correct ۞ ۞ " .toUpperCase());
                    count++ ;
                }else {
                    System.out.println(" Your ans is wrong ".toUpperCase());
                    System.out.println(" The ans is : "  + ans[i] .toUpperCase()) ;

                    System.out.println();
                }

            }
            if(count == 0 ){
                System.out.println("dirty minded ^_^ 😂😂👌".toUpperCase());
                System.out.println();
            }

            System.out.println("yeah you get a ".toUpperCase() + count  + " points" .toUpperCase());
            System.out.println("press 1 to Play Again , or any other no to exit " .toUpperCase());

             a = scan.nextInt();

            if (a==1){
                count = 0;
            }


        }
        String s = scan.nextLine();
        System.out.println("Yeah Thanks for Playing " .toUpperCase());
    }
 }

