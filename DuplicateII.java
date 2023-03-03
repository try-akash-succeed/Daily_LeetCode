import java.util.*;
public class DuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(k==0) return  false;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            if(hm.containsKey(ele) && i-hm.get(ele)<=k){
                return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
    
}
