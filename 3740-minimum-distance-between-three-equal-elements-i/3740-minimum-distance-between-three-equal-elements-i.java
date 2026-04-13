class Solution {
    public int minimumDistance(int[] nums) {
        if (nums.length < 3)
            return -1;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        int min = Integer.MAX_VALUE;       
        for (List<Integer> list : map.values()) {
            if (list.size()>=3) {       
                for (int i = 0; i+2<list.size(); i++) {
                    int a = list.get(i);
                    int c = list.get(i + 2);
                    int sum = 2*(c-a);
                    min = Math.min(min, sum);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
