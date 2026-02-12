class Solution {
    public int removeElement(int[] nums, int val) {
      
        int l=0,r=nums.length-1;
        while(l<=r){
            
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