class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,maxSum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxSum=Math.max(maxSum,sum);

        int r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum-=cardPoints[i];
            sum+=cardPoints[r];
            r--;

            maxSum=Math.max(maxSum,sum);

        }
        return maxSum;
    }
}