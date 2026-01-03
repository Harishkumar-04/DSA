/* Brute T=O(n²) S=O(1)

class Solution {
    public int repeatedNTimes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (count > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}

// Better T=O(n) S=O(n)

class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > 1)
                return num;
        }
        return -1;
    }
}

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num))
                return num;
        }
        return -1;
    }
}

*/

// Optimal - (distance ≤ 2 trick) T=O(n) S=O(1)

class Solution {
    public int repeatedNTimes(int[] nums) {

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2])
            return nums[i];
            /*Core trick: since one element fills half the array, 
            two of its occurrences must appear either next to each other or
            with just one element in between.*/
        }
        return nums[nums.length-1];
    }
}