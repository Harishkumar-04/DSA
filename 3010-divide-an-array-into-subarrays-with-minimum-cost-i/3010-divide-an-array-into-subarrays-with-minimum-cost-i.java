class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        
        int[] num=new int[nums.length-1];

        int i=0;
        for(int j=1;j<nums.length;j++){
            num[i]=nums[j];
            i++;
        }

        Arrays.sort(num);

        for(int k=0;k<2;k++){
            sum+=num[k];
        }
        return sum;
    }
}