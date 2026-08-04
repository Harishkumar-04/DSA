class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int prev=nums[i-1]+1;
            int curr=nums[i];
            if(prev==curr) continue;
            else{
                while(prev<curr){
                    list.add(prev);
                    prev++;
                }
            }
        }
        return list;
    }
}