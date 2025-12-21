/*Brute Force

class Solution {
    public int[] sortArrayByParity(int[] nums) {  
        int[] result = new int[nums.length];  
        int i=0;
        for(int num:nums){
            if(num%2==0){
            result[i++]=num;
            }
        }

        for(int num:nums){
            if(num%2!=0){
            result[i++]=num;
            }
        }
        return result;
    }
}


class Solution {
    public int[] sortArrayByParity(int[] nums) {  
        int[] result = new int[nums.length];  
        int left=0, right=nums.length-1;

        for(int num:nums){
            if(num%2==0)
            result[left++]=num;
            else
            result[right--]=num;
        }
        return result;
    }
}
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 > nums[right]%2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0)
                left++;
            if (nums[right] % 2 == 1)
                right--;
        }
        return nums;
    }
}
