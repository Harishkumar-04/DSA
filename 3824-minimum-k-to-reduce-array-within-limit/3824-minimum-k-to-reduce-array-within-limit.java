class Solution {
    public int minimumK(int[] nums) {
        int left=1,right=100000;
        int answer=right;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nonPositive(nums,mid)){
                answer=mid;
                right=mid-1;
            }
            else
            left=mid+1;
        }
        return answer;
    }

    private boolean nonPositive(int[] nums,int k){
        long op=0;

        for(int n:nums){
            op+=(n+k-1)/k;
            if(op> (long) k*k) return false;
        }
        return op <= (long) k*k;
    }
}