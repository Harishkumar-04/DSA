class Solution {
    public long gcdSum(int[] nums) {
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(nums[i],max);
        }
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length/2;i++){
            sum+=gcd(nums[i],nums[n-i-1]);
        }
        return sum;
    }

    private int gcd(int a, int b){
        while(b>0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}