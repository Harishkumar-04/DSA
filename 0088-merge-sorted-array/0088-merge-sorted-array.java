/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[n + m];
        int left = 0, right = 0, index = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                nums3[index++] = nums1[left++];
            } else {
                nums3[index++] = nums2[right++];
            }
        }

        while (left < m) {
            nums3[index++] = nums1[left++];
        }

        while (right < n) {
            nums3[index++] = nums2[right++];
        }

        for (int i = 0; i < n + m; i++) {
            nums1[i] = nums3[i];
        }
    }
}
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j])
            nums1[k--]=nums1[i--];
            
            else
            nums1[k--]=nums2[j--];
        }

        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}