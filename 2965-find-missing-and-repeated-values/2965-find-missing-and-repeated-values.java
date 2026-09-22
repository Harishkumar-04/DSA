class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                max=Math.max(max,grid[i][j]);
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int cnt=1;
        int[] ans=new int[2];
        for(int num:map.keySet()){
            if(map.get(num)>1){
                ans[0]=num;
            }
            if(num==cnt){
                cnt++;
            }
            else{
                ans[1]=cnt;
            }
        }
        if(ans[1]==0){
            ans[1]=max+1;
        }
        return ans;
    }
}