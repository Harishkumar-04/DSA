/*class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currSum=nums[0], maxSum=nums[0];

        for(int i=1;i<n;i++){
        currSum=Math.max(nums[i],currSum+nums[i]);
        maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}