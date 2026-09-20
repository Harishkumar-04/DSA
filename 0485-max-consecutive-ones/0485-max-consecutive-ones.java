class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,maxSum=0;

        for(int num:nums){
            if(num==0){
                sum=0;
            }
            sum+=num;
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}