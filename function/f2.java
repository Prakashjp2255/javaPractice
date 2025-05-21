class garden {

    int apple_price = 20 ;
    int apple_count = 5 ;

    void total_money(int money) {
        System.out.println(money);
        System.out.println("soap purchased");

    }

    public static void main(String[] args) {
        garden obj = new garden() ;
        obj.total_money(66);
       // System.out.println("the total amount of the apple is" + obj.total_money()); google it how u cant print the object fn 
    }

}
