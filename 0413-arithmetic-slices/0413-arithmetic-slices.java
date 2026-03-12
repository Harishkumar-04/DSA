class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        int cnt = 0,prev=0,curr=0;
        for(int i = 0; i < n-2; i++){
            prev = nums[i] - nums[i+1];
            for(int j = i+1; j < n-1; j++){
                    curr = nums[j] - nums[j+1];
                    if(prev==curr) cnt++;
                    else break;
                }
        }
        return cnt;
    }
}