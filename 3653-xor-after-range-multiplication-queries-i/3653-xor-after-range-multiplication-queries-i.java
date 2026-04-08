class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] x:queries){
            int l=x[0],r=x[1],k=x[2],v=x[3];

            for(int i=l;i<=r;i+=k){
                nums[i] = (int)((nums[i] * 1L * v) % 1000000007);
            }
        }
        int sum=0;
        for(int x:nums){
            sum^=x;
        }
        return sum;
        
    }
}