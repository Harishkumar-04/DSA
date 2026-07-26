class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subseq(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void subseq(int i, int[] nums, List<Integer> list, List<List<Integer>> ans){
        int n=nums.length;

        if(i==n){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        subseq(i+1, nums, list, ans);
        list.remove(list.size()-1);
        subseq(i+1, nums, list, ans);
    }
}