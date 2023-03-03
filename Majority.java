import java.util.*;
public class Majority {

        public int majorityElement(int[] nums) {
            
            if(nums.length==1){
                return nums[0];
            }
    
             HashMap<Integer,Integer> hm = new HashMap<>();
    
             for(int i=0;i<nums.length;i++){
                 if(hm.containsKey(nums[i])){
                     hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
                 }
                 else{
                     hm.put(nums[i],1);
                 }
             }
             int ans =0;
             int n =nums.length;
             for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
                 int key = entry.getKey();
                 int value = entry.getValue();
    
                 if(value>(n/2)){
                      ans = key;
                 }
             }
             return ans;
        }
}
    
