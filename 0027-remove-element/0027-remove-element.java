class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i:nums){
            if(i==val) count++;
        }
        if(count==nums.length) return 0;
        int l=0,r=nums.length-1;
        while(l<=r){
            // if(nums[left]!=val)
            // left++;
            // if(nums[right]==val)
            // right--;
            // if(nums[left]==val ) 
            while(l<nums.length && nums[l]!=val){
                l++;
            }
            while(r>=0 && nums[r]==val){
                r--;
            }
            if (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            
        }
        return r+1;  
            
    }
}