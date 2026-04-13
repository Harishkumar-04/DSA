class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l = 0, n = nums.length, oddCount = 0, count = 0,subCount=0;

        for (int r = 0; r < n; r++) {
            if (nums[r] % 2 != 0){
                oddCount++;
                subCount=0;
            }

            while(oddCount==k){
                if(nums[l]%2!=0) oddCount--;
                subCount++;
                l++;
            }
            count+=subCount;
        }
        return count;
    }
}
