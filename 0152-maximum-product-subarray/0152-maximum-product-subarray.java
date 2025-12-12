class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
    
        int maxPrd=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int prd=1;
            for(int j=i; j<n; j++){
                prd*=nums[j];
                maxPrd=Math.max(maxPrd,prd);
                
            }
        }
        return maxPrd;
    }
}