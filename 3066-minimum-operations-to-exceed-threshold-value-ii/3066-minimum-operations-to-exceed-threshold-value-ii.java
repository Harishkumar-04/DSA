class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Long> pq=new PriorityQueue<>();
        for(long num:nums){
            pq.add(num);
        }
        if (pq.size() < 2) return -1;

        int count=0;

        while(pq.peek()<k && pq.size()>=2){
            long n=pq.poll();
            long m=pq.poll();
            long res=Math.min(n,m)*2+Math.max(n,m);
            pq.add(res);
            count++;
        }
        if(pq.peek()<k) return -1;
        return count;
    }
}