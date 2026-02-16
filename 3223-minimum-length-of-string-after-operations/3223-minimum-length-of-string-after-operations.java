class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        int res = 0;

        for (int count : freq) {
            if (count == 0)
                continue;

            if (count <= 2)
                res += count;
            else
                res += (count % 2 == 0) ? 2 : 1;
        }
        return res;
    }
}

/*
class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        int res = 0;
        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            freq[index]++;
            if (freq[index] >= 3)
                freq[index] -= 2;
        }
        for (int count : freq)
            res += count;

        return res;
    }
}
*/