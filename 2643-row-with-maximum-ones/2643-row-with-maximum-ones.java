class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length, n=mat[0].length;
        int maxOne=0,idx=0;
        for(int i=0;i<m;i++){
            int cntOne=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    cntOne++;
                }
            }
            if(cntOne>maxOne){
                maxOne=cntOne;
                idx=i;
            }
        }
        return new int[] {idx,maxOne};
    }
}