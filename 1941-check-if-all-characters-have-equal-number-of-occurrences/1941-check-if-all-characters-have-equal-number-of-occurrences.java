class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int n = 0;

        for (int num : freq) {
            if (num != 0) {
                if (n == 0) {
                    n = num;
                } else if (num != n) {
                    return false;
                }
            }
        }

        return true;
    }
}