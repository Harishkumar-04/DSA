class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];
        for(char ch : word.toCharArray())
            freq[ch - 'a']++;

        Arrays.sort(freq);

        int res = 0;
        int m = 1;
        int count = 0;

        for(int i = 25; i >= 0; i--) {
            res += m * freq[i];
            count++;

            if(count % 8 == 0)
                m++;
        }

        return res;
    }
}
