class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        
        int[] arr=new int[n];
        int left=0;
        for(int i=1;i<=n;i++){
            arr[i-1]=left;
            left+=nums[i-1];
        }
        int right=0;
        for(int i=n-1;i>=0;i--){
            arr[i]=Math.abs(arr[i]-right);
            right+=nums[i];
        }
        return arr;
    }
}