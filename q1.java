import java.util.Scanner;

// for loop 

// odd number or even number 
class q1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       

       for (int count= 1;  count<=10; count=count+1)
       {
        //i want only even number 
        if (count%2==0) 
        {
            System.out.println("this is a even number : " +count);
        }

        else {

            System.out.println("this is odd numbeer " +count);
        }
       }

    }
}



// print the number which is divisible by both 3 and 5 
