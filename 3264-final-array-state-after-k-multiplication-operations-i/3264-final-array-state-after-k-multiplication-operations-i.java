class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
        }

        while (k > 0) {
            int min = pq.poll();   

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == min) {
                    nums[i] = nums[i] * multiplier;
                    pq.add(nums[i]);
                    k--;
                    break;
                }
            }
        }

        return nums;
    }
}