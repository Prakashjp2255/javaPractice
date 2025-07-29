import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threesum {

    public static List<List<Integer>> threesumm(int[] nums) {

        ArrayList <List<Integer>> res = new ArrayList<>();

        int target = 0 ;

        for(int i=0;i<nums.length-2;i++){
            for (int j=i+1; j<nums.length-1;j++){
                for(int k=j+1 ; k<nums.length; k++){
                    int temp = nums[i] + nums[j] + nums[k];
                    if(temp == target) {
                        List <Integer>  trip = Arrays.asList(nums[i] , nums[j] , nums[k]);
                        Collections.sort(trip);

                        if(!res.contains(trip)){
                            res.add(trip);
                        }
                    }
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>>  res=  threesumm(nums);

        for(List<Integer> trip : res ){
        System.out.println("Triplets" + trip) ;

        }


    }
}
