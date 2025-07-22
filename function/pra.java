import java.util.Scanner;

public class pra {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int food_time ;
        String[] food;
        
        System.out.print("ENTER THE NO OF FOOD:");
        food_time = scan .nextInt();

        food = new String[food_time];
        
        for (int i=0;i<food.length;i++){
            
            System.out.println("Enter a food :");
            food[i] = scan.nextLine();
        }
        for (String s : food){
            System.out.println(s);
        }
    }
}
