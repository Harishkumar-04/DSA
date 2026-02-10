class Solution {
    public int longestBalanced(int[] nums) {

        int n = nums.length, max = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int cnte = 0, cnto = 0;

            for (int j = i; j < n; j++) {
                if (set.add(nums[j])) {
                    if (nums[j] % 2 == 0)
                        cnte++;
                    else
                        cnto++;
                }
                if (cnte == cnto) max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}

