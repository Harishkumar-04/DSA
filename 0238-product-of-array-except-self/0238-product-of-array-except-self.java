class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        int[] arr=new int[n];
        int prd=1;
        int zero=0;
        for(int num:nums){
            if(num==0){
                zero++;
            }
            else{
                prd*=num;
            }
        }

        for(int i=0;i<n;i++){
            if(zero>1){
                return arr;
            }
            else if(zero==1){
                if(nums[i]==0){
                    arr[i]=prd;
                }
                else{
                    arr[i]=0;
                }
            }
            else{
                arr[i]=prd/nums[i];
            }
        }
        return arr;
    }
}