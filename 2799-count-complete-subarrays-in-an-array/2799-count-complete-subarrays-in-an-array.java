class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int i = 0, n = nums.length, count = 0;
        Set<Integer> cmplt = new HashSet<>();

        while (i < n) {
            for (int j = i; j < nums.length; j++) {
                cmplt.add(nums[j]);
                if (cmplt.size() == set.size()) {
                    count += (n - j);
                    break;
                }
            }
            cmplt.clear();
            i++;
        }
        return count;
    }
}