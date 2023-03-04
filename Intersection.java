import java.util.*;
public class Intersection {
        public int[] intersection(int[] nums1, int[] nums2) {
            //int n= num1.length;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            Set<Integer> hs = new HashSet<>();
            
            int i=0,j=0;
            while(i<nums1.length && j<nums2.length){
                    if(nums1[i]==nums2[j]){
                        hs.add(nums1[i]);
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
            int[] ans = new int[hs.size()];
            int k=0;
            for(int a : hs){
                ans[k++]=a;
            }
            return ans;
        }
    }
    