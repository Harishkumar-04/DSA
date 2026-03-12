class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>n) continue;
            if(nums[i]>0){
                arr[nums[i]-1]++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            return i+1;
        }
        return arr.length+1;
    }
}