class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int num = nums[i];
            while (num > 0) {
                int rem = num % 10;
                sb.append(rem);
                num /= 10;
            }
            set.add(nums[i]);
            set.add(Integer.parseInt(sb.toString()));
        }
        return set.size();
    }
}