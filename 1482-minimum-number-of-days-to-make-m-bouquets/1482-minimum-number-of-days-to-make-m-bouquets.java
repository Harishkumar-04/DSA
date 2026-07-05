class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k>bloomDay.length) return -1;

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int num:bloomDay){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        
        int low=min, high=max;
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            boolean res=possible(bloomDay, mid, m, k);

            if(res==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans; //low;
    }

    private boolean possible(int[] arr, int day, int m, int k){
        int cnt=0,bouq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                bouq+=cnt/k;
                cnt=0;
            }
        }
        bouq+=cnt/k;

        return bouq>=m;
    }
}