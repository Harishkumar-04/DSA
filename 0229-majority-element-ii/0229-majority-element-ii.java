/*Brute Force

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

*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)>n/3)
            result.add(key);
        }
        return result;
    }
}

