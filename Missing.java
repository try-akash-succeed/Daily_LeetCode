import java.util.*;
public class Missing {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int a : nums){
            hs.add(a);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
        return list;

        
    }
    
}


// O(n) solution 

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
         
         int i=0;
         
         while(i<nums.length){
             int pos = nums[i]-1;
             if(nums[i]!=nums[pos]){
                 int temp = nums[pos];
                 nums[pos]= nums[i];
                 nums[i]= temp;
             }
             else{
                 i++;
             }
         }

         for(int j=0;j<nums.length;j++){
             if(nums[j]!=j+1){
                 list.add(j+1);
             }
         }
         return list;

        
    }
}
