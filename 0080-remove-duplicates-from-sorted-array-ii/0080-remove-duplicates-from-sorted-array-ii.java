class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int count=0,count2=0;

        List<Integer> list=new ArrayList<>();
        
        while(j<nums.length){
            int n=nums[i];
            if(nums[j]==n){
                count++;
                if(count<=2){
                list.add(nums[j]);
                }
                j++;
            }else{
                i=j;
                count=0;
            }
        }

        for(int k=0;k<list.size();k++){
            nums[k]=list.get(k);
        }
        return list.size();
    }
}