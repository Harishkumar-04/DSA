class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4) return false;

        int i;

        for(i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
            continue;
            }
            break;
        }
        if(i==0) return false;

        int d=i;
        for(i=d;i<n-1;i++){
            if(nums[i]>nums[i+1]){
            continue;
            }
            break;
        }
        if(d==i) return false;

        int l=i;
        for(i=l;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                continue;
            }
            break;
        }
        if(l==i) return false;

        return i==n-1;
    }
}      