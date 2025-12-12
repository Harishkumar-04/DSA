/* Brute force T=O(n^2) S=O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=prices[j]-prices[i];
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
        
*/

// Optimal T=O(n) S=O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}