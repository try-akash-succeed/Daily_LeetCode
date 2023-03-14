
import java.util.*;
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {

        int pairSum =0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i+=2){
            
                pairSum+=nums[i];
        } 

        return pairSum;     
        
    }
    
}
