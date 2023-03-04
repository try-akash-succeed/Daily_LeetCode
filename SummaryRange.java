import java.util.*;
public class SummaryRange {
        public List<String> summaryRanges(int[] nums) {
            ArrayList<String> list = new ArrayList<>();
            int i=0;
    
            while(i<nums.length){
                int start,end;
                start = nums[i];
    
                while(i+1<nums.length  && nums[i+1]==nums[i]+1){
                    i++;
                }
                    end = nums[i];
    
                    if(start==end){
                        list.add(start+"");
                    }
                    else{
                        list.add(start+"->"+end);
                    }
                i++;
            }
            return list;
        }
    }
    

