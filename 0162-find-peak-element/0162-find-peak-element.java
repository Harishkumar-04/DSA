class Solution {
    public int findPeakElement(int[] nums) {

        int low = 1, high = nums.length - 2;

        if(nums.length==1 || nums == null){
            return 0;
        }

        if (nums[0] > nums[low])
            return 0;

        if (nums[nums.length - 1] > nums[high])
            return nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid - 1] > nums[mid])
                high = mid - 1;
            else if (nums[mid + 1] > nums[mid])
                low = mid + 1;
            else
                low = mid + 1;
        }
        return 0;
    }
}