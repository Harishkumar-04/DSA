class Solution {
    public long getDescentPeriods(int[] prices) {
        long res=0,cnt=1;
        for(int i=0;i<prices.length;i++){
            if(i>0 && prices[i] == prices[i-1]-1){
                cnt++;
            }
            else{
                cnt=1;
            }
            res+=cnt;            
        }
        return res;
    }
}