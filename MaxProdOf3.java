import java.util.Arrays;

public class MaxProdOf3 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int prod1=0;
        int prod2=0;

        for(int i=0;i<n;i++){
            prod1=nums[n-1]*nums[n-2]*nums[n-3];
            prod2=nums[0]*nums[1]*nums[n-1];
        }
        if(prod1>prod2) return prod1;
        else return prod2;
        
    }
    
}
