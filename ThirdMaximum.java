import java.util.*;
public class ThirdMaximum {
        public int thirdMax(int[] nums) {
    
            //Arrays.sort(nums);
            TreeSet<Integer> set = new TreeSet<>();
            for(int a :nums){
                set.add(a);
            }
            if(set.size()==1){
                return set.first();
            }
            if(set.size()==2){
                return set.last();
            }
    
            set.remove(set.last());
            set.remove(set.last());
    
            return set.last();
            
        }
}

// O(n) solution
class Solution {
    public int thirdMax(int[] nums) {

    Integer max1=null;
    Integer max2 =null;
    Integer max3= null;

    for(Integer a : nums){
        if(a.equals(max1) ||a.equals(max2) ||a.equals(max3)) continue;

        if(max1==null || a>max1 ){
            max3=max2;
            max2=max1;
            max1=a;
        }
        else if(max2==null || a>max2){
            max3=max2;
            max2=a;
        }
        else if(max3==null || a >max3){
            max3=a;
        }

    }

    if(max3==null){
            return max1;
        }
        return max3;
        
    }
}
    
