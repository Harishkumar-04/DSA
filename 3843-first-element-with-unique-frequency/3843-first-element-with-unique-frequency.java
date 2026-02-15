class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();

        for(int num:nums)
        map1.put(num,map1.getOrDefault(num,0)+1);

        for(int num:map1.values())
        map2.put(num,map2.getOrDefault(num,0)+1);

        for(int num:nums){
            int i=map1.get(num);
            if(map2.get(i)==1)
            return num;
        }
        return -1;
    }
}