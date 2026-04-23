class Solution {
    public long[] distance(int[] nums) {

        int n = nums.length;
        long[] ans = new long[n];

        HashMap<Integer, Long> count = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if (count.containsKey(num)) {
                ans[i] += count.get(num) * i - sum.get(num);
            }

            count.put(num, count.getOrDefault(num, 0L) + 1);
            sum.put(num, sum.getOrDefault(num, 0L) + i);
        }

        count.clear();
        sum.clear();

        for (int i = n - 1; i >= 0; i--) {
            int num = nums[i];

            if (count.containsKey(num)) {
                ans[i] += sum.get(num) - count.get(num) * i;
            }

            count.put(num, count.getOrDefault(num, 0L) + 1);
            sum.put(num, sum.getOrDefault(num, 0L) + i);
        }

        return ans;
    }
}