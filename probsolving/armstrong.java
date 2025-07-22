package probsolving;

    import java.util.*;

public class armstrong {
    public static  void main (String[] args) {
        //find armtrong no
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no :");
        int num = scan.nextInt();

        if(isArmstrong(num)) {
            System.out.println("Yes it is Armstrong ");
        }else {
            System.out.println("No it is not armstrong");
        }

    }
    public static boolean isArmstrong(int num){
        int sum =0 ;
        int digits = String.valueOf(num).length();
        int org = num ;

        while (num > 0){
            int d = num %10;
            sum = sum + ((int)Math.pow(num,d));
            num = num/10;
            System.out.println(((int)Math.pow(num,d)));
        }

        return num == org ;
    }

}
