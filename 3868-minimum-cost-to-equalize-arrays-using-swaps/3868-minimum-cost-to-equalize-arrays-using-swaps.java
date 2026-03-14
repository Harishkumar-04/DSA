class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();      
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
            map.put(nums2[i],map.getOrDefault(nums2[i],0)-1);
        }   
        int sum=0;
        for(int num:map.values()){
            if(num%2!=0) return -1;          
            sum+=Math.abs(num/2);
        }       
        return sum/2;
    }
}

