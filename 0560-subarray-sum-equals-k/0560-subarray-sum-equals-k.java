class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0;
        for (int i = 0; i < n; i++) {
            int add = 0;
            for (int j = i; j < n; j++) {
                add += nums[j];
                if (add == k) {
                    count++;
                }
            }
        }
        return count;
    }
}