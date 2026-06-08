class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()){
                st.push(nums[i]);
            }
            else if(st.peek()<=nums[i]){
                st.push(nums[i]);
            }
        }
        return st.size();
    }
}