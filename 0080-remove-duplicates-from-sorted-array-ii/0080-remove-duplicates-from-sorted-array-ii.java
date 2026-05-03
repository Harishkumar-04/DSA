class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0,k=0;
        int count=0;
        
        while(j<nums.length){
        
            if(nums[j]==nums[i]){
                count++;
            }
            else{
                i=j;
                count=1;
            }
            if (count<=2) {
                nums[k]=nums[j];
                k++;
            }
            j++;
        }
        return k;
    }
}