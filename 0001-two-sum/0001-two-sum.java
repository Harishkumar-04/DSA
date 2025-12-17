/*Brute force; tc=o(n2) sc=o(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target)
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}

*/

//HashMap (optimal for unsorted array) tc=o(n) sc=o(n) ; also use sorted array but not optimal

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int need = target - current;

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(current, i);
        }
        return new int[] {};
    }
}

/*Two pointer (works only for sorted array-optimal) tc=O(n) sc=O(1) ;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int left=0;
        int right=n-1;

        while(left<right){
            int sum=nums[left]+nums[right];

            if(sum==target)
            return new int[]{left,right};

            else if(sum<target)
            left++;

            else
            right--;
        }
        return new int[]{};
    }
}

*/