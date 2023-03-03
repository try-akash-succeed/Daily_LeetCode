import java.util.*;;
class Distinct {
    public int singleNumber(int[] nums) {
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
         for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
             int key = entry.getKey();
             int value = entry.getValue();

             if(value==1){
                  ans = key;
             }
         }
         return ans;
    }
}



// using OR operator 

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int ans=0;
         for(int i=0;i<nums.length;i++){
            ans= ans ^ nums[i];
         }
         return ans;
    }
}