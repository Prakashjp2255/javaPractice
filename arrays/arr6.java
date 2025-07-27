public class arr6 {
    public static void main (String [] args) {
        int arr[] = {12,345,2,6,7894};

        // o/p -- > 2 
        // 12 ---> 2 digits  !
        // 345 --> 3  " " "
        // 2 -->   1  
        // 6 -->   1 
        // 7894 -> 4   !
        // so the even count is 2 

        int count = 0;
        for(int s : arr){
            String str = Integer.toString(s);
            if(str.length() %2==0 ){
                count++ ;
            }
        }
        System.out.println(count);
    }
}
