// class Solution {
//     public int repeatedNTimes(int[] nums) {
//         int n=nums.length/2;
//         int[] freq=new int[nums.length];

//         for(int i=0;i<nums.length;i++){
//             freq[nums[i]-1]++;
//         }
//         for(int i=0;i<freq.length;i++){
//             if(freq[i]==n)
//             return i+1;
//         }
//         return -1;
//     }
// }

// class Solution {
//     public int repeatedNTimes(int[] nums) {
//         int n = nums.length / 2;

//         Map<Integer, Integer> map = new HashMap<>();

//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if (map.get(num) > n / 2)
//                 return num;
//         }
//         return -1;
//     }
// }

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