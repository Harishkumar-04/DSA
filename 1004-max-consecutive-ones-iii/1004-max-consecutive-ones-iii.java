class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0,max=0,oCount=0,zCount=0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]==1) oCount++;
            else zCount++;
                

            while (zCount>k) {
                if (nums[j]==1) oCount--;
                else zCount--;
                j++;
            }

            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}