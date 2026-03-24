/*
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] words2 = new int[words.length];
        int l = 0;
        for (String s2 : words) {
            int[] freq2 = new int[26];
            for (int k = 0; k < s2.length(); k++) {
                char ch2 = s2.charAt(k);
                freq2[ch2 - 'a']++;
            }
            for (int num2 : freq2) {
                if (num2 != 0) {
                    words2[l] = num2;
                    l++;
                    break;
                }
            }
        }

        int[] arr = new int[queries.length];
        int i = 0, f1 = 0;
        for (String s1 : queries) {
            int[] freq1 = new int[26];
            int count = 0;
            for (int j = 0; j < s1.length(); j++) {
                char ch1 = s1.charAt(j);
                freq1[ch1 - 'a']++;
            }
            for (int num1 : freq1) {
                if (num1 != 0) {
                    f1 = num1;
                    break;
                }
            }

            for (int f2 : words2) {
                if (f2 > f1)
                    count++;
            }
            arr[i] = count;
            i++;
        }
        return arr;

    }
}
*/

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


