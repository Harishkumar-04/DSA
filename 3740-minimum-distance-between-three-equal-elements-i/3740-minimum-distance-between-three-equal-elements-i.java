class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3) return -1;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i= 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        int min=Integer.MAX_VALUE;
        boolean three=false;
        for(List<Integer> list:map.values()){
            if(list.size()>=3){
                three=true;

                for (int i = 0; i <= list.size() - 3; i++) {
                    int a = list.get(i);
                    int b = list.get(i + 1);
                    int c = list.get(i + 2);

                    int sum = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                    min = Math.min(min, sum);
                }
            }           
        }
        if(!three) return -1;

        return min;     
    }
}
