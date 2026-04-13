class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int i = 0, n = nums.length, count = 0;

        while (i < n) {
            Set<Integer> cmplt = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                cmplt.add(nums[j]);
                if (cmplt.size() == set.size()) {
                    count += (n - j);
                    break;
                }
            }
            i++;
        }
        return count;
    }
}