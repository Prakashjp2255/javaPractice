import java.util.Scanner;

public class java_quiz {
    public static void main(String[] args){

        String[] questions = { "What is the main function of router ?",
                "which part of computer is consider as brain ?" ,
                "what year of facbook is launched ?",
                "who is known as the father of computer ?",
                "what was the first programming language ?"
        };

        Scanner scan = new Scanner(System.in);
        String[] answers = { "Directing internet traffic" , "CPU" , "2004" , "charles babbage" , "fortran"};
        System.out.println("WELCOME TO JAVA QUIZ GAME !");

        String guess ;
        int total =0 ;

        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            System.out.print("your answer here : ");
            guess = scan.nextLine();
            if (guess.equals(answers[i])){
                System.out.println("yeah you are right !");
                total++;
            }else {
                System.out.println("you are wrong !");
            }
        }
        System.out.println("your score is : "+ total + " out of " + answers.length);


    }
}
