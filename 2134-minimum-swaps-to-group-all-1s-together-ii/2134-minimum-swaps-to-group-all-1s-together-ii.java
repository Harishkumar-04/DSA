class Solution {
    public int minSwaps(int[] nums) {

        int ones=0;
        for(int num:nums){
            ones+=num;
        }
        if(ones<=1) return 0;

        int currOnes=0;
        for(int i=0;i<ones;i++){
            currOnes+=nums[i];
        }

        int maxOnes=currOnes,n=nums.length;
        for(int i=ones;i<n+ones;i++){
            currOnes+=nums[i%n];
            currOnes-=nums[i-ones];

            maxOnes=Math.max(maxOnes,currOnes);
        }
        return ones-maxOnes;
    }
}