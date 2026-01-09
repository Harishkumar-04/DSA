class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] arr= new int[nums.length];
        int len=nums.length;
        int c=0;
        for(int i=0;i<len;i++){
            c=0;
            for(int j=0;j<len;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    c+=1;

                }
            }
            arr[i]=c;

        }
        return arr;
        
    }
}