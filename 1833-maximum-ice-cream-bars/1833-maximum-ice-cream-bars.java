class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int cnt=0, ice=0;

        for(int num:costs){
           if(num<=coins){
            cnt++;
            coins-=num;
           }else{
            break;
           }
        }
        return cnt;
    } 
      
}