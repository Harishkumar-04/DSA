/* Brute Force T=O(n²) S=O(1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (result.contains(nums[i]))
                continue;

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j])
                    count++;
            }

            if (count > n / 3)
                result.add(nums[i]);
        }
        return result;
    }
}

Better T=O(n) S=O(n)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3)
                result.add(key);
        }
        return result;
    }
}

*/

//Optimal T=O(n) S=O(1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3)
            result.add(candidate1);
        if (count2 > n / 3)
            result.add(candidate2);
        return result;
    }
}