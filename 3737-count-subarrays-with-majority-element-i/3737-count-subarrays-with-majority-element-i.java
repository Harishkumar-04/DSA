class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    cnt++;
                }
                if(2*cnt>j-i+1){ // cnt>(len/2) => 2*cnt>len [len=j-i+1]
                    ans++;
                }
            }
        }
        return ans;
    }
}