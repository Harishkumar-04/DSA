/*Brute Force TC=O(n × k) SC=O(1)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;   
                }
            }
        }
        return false;  
    }
}

*/

//Optimal-HashMap TC=O(n) SC=O(n)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int val = map.get(num);
                if (i - val <= k) {
                    return true;  //if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) 
                }
            }
            map.put(num, i);
        }
        return false;
    }

}
