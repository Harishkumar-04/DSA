/*Brute Force

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int waterHeight=Math.min(height[i], height[j]);
                int width=j-i;
                int area=waterHeight*width;
                max=Math.max(max, area);
            }
        }
        return max;
    }
}
*/

//Optimal

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;

        while (left < right) {
            int waterHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = waterHeight * width;
            max = Math.max(max, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}