class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while(j<nums2.length && i<nums1.length){

        if (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]){
            list.add(nums1[i]);
            i++;
            j++;
        }
        else if (nums2[j] > nums1[i])
            i++;
        else
            j++;
        }

        int[] arr = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }

        return arr;
    }
}
