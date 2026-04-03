class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int valid=0;
                for(int k=j+1;k<n;k++){
                    if(rating[i]<rating[j] && rating[j]<rating[k])
                    valid++;

                    if(rating[i]>rating[j] && rating[j]>rating[k])
                    valid++;
                }
                count+=valid;
            }
        }
        return count;
    }
}