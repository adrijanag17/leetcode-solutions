public class BestTimeToBuyAndSellStock {

    // using maximum subarray technique - Kadane's algorithm
    public static int maxProfit(int[] prices){
        int max = 0;
        int currMax = 0;

        for (int i = 1; i < prices.length; i++){
            currMax += prices[i] - prices[i-1];
            currMax = Math.max(0, currMax);
            max = Math.max(currMax, max);
        }
        return max;
    }       // T: O(n) S: O(1)

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
