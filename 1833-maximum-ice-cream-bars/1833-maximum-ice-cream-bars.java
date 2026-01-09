class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Queue<Integer> q=new PriorityQueue<>();int c=0;
       for(int i:costs) q.add(i);
       while(!q.isEmpty() && q.peek()<=coins){
          c++;
          coins-=q.poll();
       }
       return c;

        // Arrays.sort(costs);

        // int cnt=0, ice=0;

        // for(int num:costs){
        //    if(num<=coins){
        //     cnt++;
        //     coins-=num;
        //    }else{
        //     break;
        //    }
        // }
        // return cnt;
    } 
      
}