class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[nums.length - 1];
        int[] result = new int[2];
        int i = 0;

        for (int num : nums) {
            count[num]++;
            if (count[num] == 2)
                result[i++] = num;
        }
        return result;
    }
}

/*
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            list.add(nums[i]);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        arr[i] = list.get(i);
        }
        return arr;
    }
}
*/