class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0,sum=0;

        int i=0;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];

            if((j-i+1)==k){
                if(sum>=k*threshold){
                    count++;
                }
                sum-=arr[i];
                i++;
            }
        }
        return count;
        
    }
}