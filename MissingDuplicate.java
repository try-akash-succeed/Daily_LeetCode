import java.util.*;
public class MissingDuplicate {
        public int[] findErrorNums(int[] nums) {
    
            int[] ans = new int[2];
    
            
            for(int i=0;i<nums.length;i++){
                int abs = Math.abs(nums[i]);
    
                if(nums[abs-1]<0){
                    ans[0]=abs;
                }else{
                    nums[abs-1]=-nums[abs-1];
                }
            }
    
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0){
                    ans[1]=i+1;
                }
            }
    
            return ans;
            
            
        }
    }
//Using Hashmap


class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];
         
        HashMap<Integer,Boolean> hm = new HashMap<>();
        
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,true);
            }
            else{
                ans[0]=i;
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(hm.get(i)==null){
                ans[1]=i;
            }
        }

        return ans;
        
        
    }
}
