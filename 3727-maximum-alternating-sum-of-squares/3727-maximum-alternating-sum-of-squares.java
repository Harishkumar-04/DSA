class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);

        int left=0, right=n-1;
        long sum=0;

        while(left<right){
            int r=nums[right--];
            int l=nums[left++];

            sum+=(r*r)-(l*l);
        }
        if(n%2==1) sum+=nums[left]*nums[left];

        return sum;
    }
}