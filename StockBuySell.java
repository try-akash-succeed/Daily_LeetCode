public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxsofar=0;
        int curr =Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            curr = Math.min(curr,prices[i]);

            maxsofar=Math.max(prices[i]-curr,maxsofar);

        }

        return maxsofar;
    }


    
}
