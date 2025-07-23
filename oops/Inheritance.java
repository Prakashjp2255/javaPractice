package oops;

interface system {
    void brake();
    void acclator();
}

 class car implements system {
        public void brake() {
            System.out.println("The car is stop ");
        }
        public void acclator() {
            System.out.println("The car is raise");
        }
    }
    class bike implements system{

        public void brake() {
            System.out.println("The bike is stop ");
        }
        public void acclator() {
            System.out.println("The bike is raise ");
        }
    }

public class Inheritance {    public static void main(String[] args) {

        // inheritance is one class (properties and methods ) are same in other class
        // there are many types of inheritancce 
        //    --> single level 
        //    --> multi level 
        //    --> multiple   --------- interface use panni tha pannuvom 
        //    --> hierachical 

       car obj2 = new car();
       obj2.brake();
       obj2.acclator();
    }
}
