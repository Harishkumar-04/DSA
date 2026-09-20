class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();

        Set<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }

        for(int num:nums2){
            if(set1.contains(num)){
                set1.remove(Integer.valueOf(num));
            }
        }
        ans.add(new ArrayList<>(set1));

        Set<Integer> set2=new HashSet<>();
        for(int num:nums2){
            set2.add(num);
        }

        for(int num:nums1){
            if(set2.contains(num)){
                set2.remove(Integer.valueOf(num));
            }
        }
        ans.add(new ArrayList<>(set2));

        return ans;
    }
}