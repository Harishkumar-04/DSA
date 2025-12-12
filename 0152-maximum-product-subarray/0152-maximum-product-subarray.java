class Solution {
    public int maxProduct(int[] nums) {
        int maxPrd=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            int prd=1;
            for(int j=i;j<n;j++){
                prd*=nums[j];
                maxPrd=Math.max(maxPrd,prd);
            }
        }
        return maxPrd;
        
    }
}