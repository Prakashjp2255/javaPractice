package oops;

//              polymorphism means many forms 

//              it has 2 types 
//              1 ---> method overloading  -- same name , same method , different parameter 
//              2 ---> method overriding   -- same name , same method , same parameter but diffferent behaviour 

class calculator1 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

}

public class polymorphism {
    public static void main(String[] args) {
        calculator1 obj = new calculator1();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2.5, 8.7, 9.7));

    }

}


