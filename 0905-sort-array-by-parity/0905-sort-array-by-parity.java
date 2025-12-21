class Solution {
    public int[] sortArrayByParity(int[] nums) {  
        int[] res = new int[nums.length];  
        int st=0;
        for(int num:nums){
            if(num%2==0){
            res[st]=num;
            st++;
            }
        }

        for(int num:nums){
            if(num%2!=0){
            res[st]=num;
            st++;
            }
        }
        return res;
    }
}