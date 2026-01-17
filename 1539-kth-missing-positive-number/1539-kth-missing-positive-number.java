class Solution {
    public int findKthPositive(int[] arr, int k) {

        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return low + k; //return k+high+1;
    }
}

/*class Solution {
    public int findKthPositive(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k)
                k++;
            else
                break;
        }
        return k;
    }
}
*/
/*
class Solution {
    public int findKthPositive(int[] arr, int k) {

        int missingCount = 0, i = 0, num = 1;      

        while (true) {
            if (i >= arr.length || arr[i] != num) {
                missingCount++;

                if (missingCount == k) {
                    return num;
                }
            } 
            else {
                i++;
            }

            num++;
        }
    }
}
*/