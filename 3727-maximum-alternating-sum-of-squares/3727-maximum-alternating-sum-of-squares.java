class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Math.abs(nums[i]);
        }
        Arrays.sort(arr);

        int left=0, right=n-1;
        long sum=0;

        while(left<right){
            int r=arr[right--];
            int l=arr[left++];

            sum+=(r*r)-(l*l);
        }
        if(n%2==1) sum+=arr[left]*arr[left];

        return sum;
    }
}