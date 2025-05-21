// just a simple hello world in java 
import java.util.Scanner;
class hello {
    public static void main (String[] args)
    {
        int container = 77;
        String cointin = "vanakam da ";
        System.out.println(container); //  println means print next line
        System.out.print(cointin);
    }
}

// simple add number 

class vanakam {
    public static void main(String[] args) {
        int a = 23;
        int b =34;
        int c = 77;
        System.out.println(a+b+c);
    }
}

// basic qn 1 

class  q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if (num1 > num2 ){
            System.out.println("num1 is greater");
        }
        else{
            System.out.println("num 2 is greater");
        }

    }
}

