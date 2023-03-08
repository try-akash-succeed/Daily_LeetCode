public class MaximumAvgSub {
    public double findMaxAverage(int[] nums, int k) {
        
        double max=0;
        int n = nums.length;

        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        double window =max;
        for(int i=k;i<n;i++){
            window+=nums[i]-nums[i-k];
            max=Math.max(max,window);
        }
        return (double)max/(double)k;
    }
}
