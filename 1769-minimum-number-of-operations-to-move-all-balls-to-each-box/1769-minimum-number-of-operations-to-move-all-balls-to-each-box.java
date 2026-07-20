class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans=new int[n];
        int balls=0,cost=0;
        for(int i=0;i<boxes.length();i++){
            ans[i]=cost;
            if(boxes.charAt(i)=='1'){
                balls++;
            }
            cost+=balls;
        }

        balls=0;
        cost=0;
        for(int i=n-1;i>=0;i--){
            ans[i]+=cost;
            if(boxes.charAt(i)=='1'){
                balls++;
            }
            cost+=balls;
        }
        return ans;
    }
}