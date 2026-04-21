class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        long count=0,pairs=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            int freq=map.get(nums[i]);

            if(freq>1){
               pairs+=freq-1;
            }
            while(pairs>=k){
                count+=nums.length-i;

                int f=map.get(nums[j]);
                pairs-=f-1;
                map.put(nums[j],f-1);
                j++;
            }
        }
        return count;
    }
}