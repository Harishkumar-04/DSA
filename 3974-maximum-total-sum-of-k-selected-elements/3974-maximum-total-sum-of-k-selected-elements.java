/*class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long tot=0;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.add(n);
        }

        while(k>0){
            int num=pq.poll();
            if(mul>0){
                tot+= (long) mul*num;
            }
            else{
                tot+=num;
            }
            mul--;
            k--;
        }
        return tot;  
    }
}

*/
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long tot=0;

        int r=nums.length-1;
        while(k>0){
            if(mul>0){
                tot+= (long) mul*nums[r];
            }
            else{
                tot+=nums[r];
            }
            mul--;
            r--;
            k--;
        }
        return tot;
    }
}

