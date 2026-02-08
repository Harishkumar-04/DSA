class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] res=new int[n];

        int lSum=0;
        for(int i=0;i<n-1;i++){
        lSum+=nums[i];
        left[i+1]=lSum;
        }
        

        int rSum=0;
        for(int i=n-1;i>0;i--){
        rSum+=nums[i];
        right[i-1]=rSum;
        }

        for(int i=0;i<n;i++){
            res[i]=Math.abs(left[i] - right[i]);
        }
        return res;
    }
}