class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums1) {
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        int idx = nums1.length - 1;
        while (!stack.isEmpty()) {
            int n = stack.pop();
            int nextGreater = -1;

            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] == n) {
                    for (int j = i + 1; j < nums2.length; j++) {
                        if (nums2[j] > n) {
                            nextGreater = nums2[j];
                            break;
                        }
                    }
                    break;
                }
            }

            result[idx--] = nextGreater;
        }

        return result;
    }
}
