/* Brute Force tc=O(n^2) SC=O(1) ; TLE

class Solution {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

*/

/* Sorting tc=O(nlogn) sc=O(1)

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            return true;
        }
        return false;
    }
}

*/

/*HashSet tc=O(n) sc=O(n) ;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}

