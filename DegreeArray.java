import java.util.*;
public class DegreeArray {

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        HashMap<Integer,Integer> first = new HashMap<>();

        int max=0;
        int range =0;

        for(int i=0;i<nums.length;i++){
                 first.putIfAbsent(nums[i],i);

            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);

            if(hm.get(nums[i])>max){
                max=hm.get(nums[i]);

                range = i-first.get(nums[i])+1;


            }
            else if(hm.get(nums[i])==max){
                range=Math.min(range,i-first.get(nums[i])+1);

            }
        }
        return range;

        
    }
    
}
