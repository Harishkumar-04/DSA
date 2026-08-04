class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i])
            continue;
            else{
                int j=nums[i-1]+1;
                while(j<nums[i]){
                    list.add(j);
                    j++;
                }
            }
        }
        return list;
    }
}