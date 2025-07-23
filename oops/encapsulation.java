package oops;

class Banking {

    private int accountno = 9999029;
    private int balance = 120;

    //get and set 
    public int getAccountno(){
        return accountno ;
    }

    public void setAccountno(int acc){
        System.out.println("Account change to :" + acc);
    }

     public int getBalance(){
        return balance ;
    }

    public void setBalance(int bal){
        System.out.println("Balance update :" + bal);
    }
}

public class encapsulation {
    public static void main(String[] args) {
         Banking obj3 = new Banking();
         obj3.setBalance(890);
         obj3.getBalance();

         obj3.setAccountno(943222);
         obj3.getAccountno();
    }
   
}
