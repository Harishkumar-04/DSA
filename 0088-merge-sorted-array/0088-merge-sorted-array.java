/* Brute Force T=O(n log n) S=O(n)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[n + m];
        int i = 0;

        for (int j = 0; j < m; j++) {
            nums3[i++] = nums1[j];
        }

        for (int j = 0; j < n; j++) {
            nums3[i++] = nums2[j];
        }

        Arrays.sort(nums3);

        for (int j = 0; j < m + n; j++) {
            nums1[j] = nums3[j];
        }
    }
}

// Better T=O(n) S=O(n)
class Solution {
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

// Optimal T=O(n) S=O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;

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

*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j])
            nums1[k--]=nums1[i--];
            else
            nums1[k--]=nums2[j--];
        }
    }
}
