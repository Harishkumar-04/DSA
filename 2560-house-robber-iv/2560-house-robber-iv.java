class Solution {
    public int minCapability(int[] nums, int k) {
        if(k>nums.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num:nums){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
                
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int res=noh(nums, mid);
            
            if(res>=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    private int noh(int[] nums, int cap){
        int robbed=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=cap){
                robbed++;
                i++;
            }
        }
        return robbed;
    }
}