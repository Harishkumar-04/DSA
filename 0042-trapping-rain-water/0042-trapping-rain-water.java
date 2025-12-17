/*Better Solution T=O(n) S=O(n)

class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }

        max = -1;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            right[i] = max;
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(left[i], right[i]) - height[i];
        }
        return total;
    }
}
*/

//Optimal

class Solution {
    public int trap(int[] height) {

        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}
