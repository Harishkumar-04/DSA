class Solution {
    public int findPeakElement(int[] nums) {

        int n=nums.length;
        int low = 1, high = n-1;

        if(nums == null || n==1){
            return 0;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid==0 || nums[mid - 1] < nums[mid]) && (mid==n-1 || nums[mid] > nums[mid + 1]))
                return mid;
            else if (nums[mid - 1] > nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return 0;
    }
}