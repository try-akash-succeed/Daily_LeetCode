import java.util.*;
public class DistributeCandies {

    public int distributeCandies(int[] candy) {

        HashSet<Integer> hs = new HashSet<>();
        int n = candy.length;
    
        for(int i=0;i<candy.length;i++){
            hs.add(candy[i]);
        }
        int slice = n/2;
         if(hs.size()>=slice){
             return slice;
         }
         return hs.size();
            
        }
    
}
