package oops;

import java.util.Scanner;

class cal {
    void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int user = scan.nextInt(); 
        int user1 = scan.nextInt(); 
        System.out.println(user + user1);
    }
    void sub(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int user = scan.nextInt(); 
        int user1 = scan.nextInt(); 
        System.out.println(user - user1);
    }
    void mul(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int user = scan.nextInt(); 
        int user1 = scan.nextInt(); 
        System.out.println(user * user1);
    }
    void div(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int user = scan.nextInt(); 
        int user1 = scan.nextInt(); 
        System.out.println(user / user1);
    }
}

public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the calculator " .toUpperCase());  
        System.out.println();  
        System.out.println(" press 1 for addition " .toUpperCase());
        System.out.println(" press 2 for subraction" .toUpperCase()); 
        System.out.println(" press 3 for subraction".toUpperCase()); 
        System.out.println(" press 4 for subraction".toUpperCase()) ; 
              
        int choice = scan.nextInt();

        if(choice == 1 ){
            cal obj = new cal();
            obj.add();
        }
        if(choice == 2 ){
            cal obj = new cal();
            obj.sub();
        }
        if(choice == 3 ){
            cal obj = new cal();
            obj.mul();
        }
        if(choice == 4 ){
            cal obj = new cal();
            obj.div();
        }

    }
}
// i have to modify more its not a calculator 
// its base 