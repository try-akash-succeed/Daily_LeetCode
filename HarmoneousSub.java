import java.util.*;
public class HarmoneousSub {

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1;
        int count=0;

        while(j<nums.length){
            if(nums[j]-nums[i]==1){
                count=Math.max(count,j-i+1);
                j++;
            }

            else if(nums[j]-nums[i]==0){
                j++;
            }
            else{
                i++;
            }
        }
        return count;

        
        
    }
    
}
