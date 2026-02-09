class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> ans=new ArrayList<>();
        ans.add((long)nums[0]);
        for(int i=1;i<nums.length;i++){
            if((long)nums[i]==ans.get(ans.size()-1)){
                long v=ans.get(ans.size()-1);
                ans.remove(ans.size()-1);
                ans.add(v+(long)(nums[i]));
                while(ans.size()>1 && ans.get(ans.size()-1).equals(ans.get(ans.size()-2))){
                    long a=ans.remove(ans.size()-1);
                    long b=ans.remove(ans.size()-1);
                    ans.add(a+b);
                }
            }
            else ans.add((long)nums[i]);
        }
        return ans;
    }
}