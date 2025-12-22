/*
Brute Force T=O(n) S=O(n)

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[i] = s[n - 1 - i];
        }
        
        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }
}
*/
// Optimal T=O(n) S=O(1)
class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}