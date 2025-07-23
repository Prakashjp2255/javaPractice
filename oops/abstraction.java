package oops;


abstract class calculator { //  --> abstract class ku obj create panna theva illa 

    abstract void add(int a , int b); //abstract method -> ithu iruntha kandippa extend la use panra 
    abstract void sub(int a , int b);                //    fn ku use panni aaganum atha rule ..


    void mul (int a , int b ) {
        System.out.println(a*b);
    }

}

class man1 extends calculator{
    
    void add (int a , int b){
        System.out.println(a+b);
    }
    void sub (int a , int b){
        System.out.println(a-b);
    }
}

class man2 extends calculator{
    void add(int a , int b ){
     System.out.println("The man2 add is :");   
     System.out.println(a+b);   
    }
    void sub(int a , int b ){
     System.out.println("The man2 sub is :");   
     System.out.println(a-b);   
    }
}


public class abstraction {
    public static void main(String[] args) {
        man2 obj = new man2();
        obj.add(2,9);
        obj.sub(2,9);
        System.out.println("the man2 mul is :");
        obj.mul(9, 88);

        man1 obj2 = new man1();
        obj2.mul(3, 6);

        
    }    
}