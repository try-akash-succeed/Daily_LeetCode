import java.util.*;
public class RelativeRank {

    public String[] findRelativeRanks(int[] score) {

        Map<Integer,Integer> m = new TreeMap<>();

        for(int i=0;i<score.length;i++){
            m.put(score[i],i);
        }

        int i=0;
        String[] ans = new String[score.length];
        int n= score.length;
        for(Integer value : m.values()){
            if(i==n-3){
                ans[value]="Bronze Medal";
            }
            else if(i==n-2){
                ans[value]="Silver Medal";
            }
            else if(i==n-1){
                ans[value]="Gold Medal";
            }
            else{
                ans[value]=n-i+"";
            }
            i++;
        }
        return ans;
      
    }
    
}
