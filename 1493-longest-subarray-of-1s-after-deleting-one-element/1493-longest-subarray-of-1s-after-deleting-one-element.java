/* my very 1st approach 1938ms

class Solution {
    public int longestSubarray(int[] nums) {
        int idx = -1, max = 0;
        boolean zero = false;

        for (int i = 0; i < nums.length;) {

            zero = false;
            idx = -1;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == 0 && zero) {
                    max = Math.max(max, j - i - 1);
                    i = idx + 1;
                    break;
                } else if (nums[j] == 0 && !zero) {
                    zero = true;
                    idx = j;
                }

                if (j == nums.length - 1) {
                    max = Math.max(max, j - i);
                    i++;
                }
            }
        }

        return max;
    }
}
*/

/* 1721 ms

class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;

        for(int i=0;i<nums.length;i++){
            int zeros=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0) zeros++;

                if(zeros>1) break;

                max=Math.max(max,j-i);
            }
        }
        return max;
    }
}
*/

class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, i = 0, zeros = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                zeros++;

            while (zeros > 1) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }
            max = Math.max(max, j - i);
        }

        return max;
    }
}