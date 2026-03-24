class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] wordFreq = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordFreq[i] = getFrequency(words[i]);
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int qFreq = getFrequency(queries[i]);
            int count = 0;

            for (int wFreq : wordFreq) {
                if (wFreq > qFreq) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    private int getFrequency(String s) {

        int[] freq = new int[26];

        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);
            freq[ch - 'a']++;
        }

        for (int f : freq) {
            if (f != 0) {
                return f;
            }
        }
        return 0;
    }
}
