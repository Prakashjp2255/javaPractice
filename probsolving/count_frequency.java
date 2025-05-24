package probsolving;

public class count_frequency {
     public static void main (String[] args){

        int arr[]= {10,5,15,10,15,5};
        int[] visitarr = new int [arr.length];
        int count ;
        int visited = -1;
        for (int i=0;i<arr.length;i++){
            count = 1 ;
            for (int j= i+1;j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visitarr[j] =visited ;
                }
            }
            if (visitarr[i] != visited){
                visitarr[i] = count ;
            }
        }
        for (int i=0 ; i<visitarr.length; i++){
            if (visitarr[i]!=visited){
                System.out.println("Frequency of visited arr " + arr[i] + "-" + visitarr[i]);
            }
        }
    }    
}
