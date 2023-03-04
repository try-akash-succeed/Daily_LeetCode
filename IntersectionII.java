import java.util.*;
public class IntersectionII {

        public int[] intersect(int[] nums1, int[] nums2) {
            //int n= num1.length;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> list = new ArrayList<>();
            
            int i=0,j=0;
            while(i<nums1.length && j<nums2.length){
                    if(nums1[i]==nums2[j]){
                        list.add(nums1[i]);
                        i++;
                        j++;
                    }
                    else if(nums1[i]<nums2[j]){
                        i++;
                    }
                    else{
                        j++;
                    }
            }
            int[] ans = new int[list.size()];
            int k=0;
            for(int a : list){
                ans[k++]=a;
            }
            return ans;
        }
 }
    
