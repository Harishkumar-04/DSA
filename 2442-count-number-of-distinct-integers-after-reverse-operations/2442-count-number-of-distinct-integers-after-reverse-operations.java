class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int ans=0;
            while (num > 0) {
                ans *= 10;
                ans+=num%10;
                num /= 10;
            }
            set.add(nums[i]);
            set.add(ans);
        }
        return set.size();
    }
}