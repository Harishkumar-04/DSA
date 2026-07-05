class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;
        int max=0,sum=0;
        for(int num:nums){
            max=Math.max(max,num);
            sum+=num;
        }
        
        int low=max,high=sum;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int res=cntSubArr(nums, mid);
            
            if(res>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    
    private int cntSubArr(int[] nums, int limit){
        int subArr=1;
        long sum=0;
        for(int num:nums){
            if(sum+num<=limit){
                sum+=num;
            }
            else{
                sum=num;
                subArr++;
            }
        }
        return subArr;
    }
}