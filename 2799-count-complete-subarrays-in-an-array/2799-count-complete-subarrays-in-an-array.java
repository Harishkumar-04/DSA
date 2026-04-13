class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int n=nums.length,count=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> cmplt=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                cmplt.add(nums[j]);
                if(cmplt.size()==set.size()){
                    count+=(n-j);
                    break;
                }
            }          
        }

        return count;       
    }
}