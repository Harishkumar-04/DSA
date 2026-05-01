class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0,k=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            k+=i*nums[i];
        }
        int max=k;
            
        for(int j=1;j<n;j++){
            k=k+sum-n*nums[n-j];
            max=Math.max(max,k);
        }
        return max;
    }
}