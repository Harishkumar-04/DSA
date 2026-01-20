class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] result=new int[nums.size()];
        
        for(int i=0;i<nums.size();i++){
            int num=-1;
            int a=1;
            while(a<nums.get(i)){
            if((a | a+1) ==nums.get(i)){
                num=a;
                break;
            }
            a++;
        }
        result[i]=num;
        }
        return result;
    }
}
