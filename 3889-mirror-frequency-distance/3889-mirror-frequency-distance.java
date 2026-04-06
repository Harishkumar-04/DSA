class Solution {
    public int mirrorFrequency(String s) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[10];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c))
                freq1[c - 'a']++;
            else
                freq2[c - '0']++;
        }

        int sum = 0;

        for (int i = 0; i < 13; i++) {
            sum += Math.abs(freq1[i] - freq1[25 - i]);
        }
        for (int i = 0; i < 5; i++) {
            sum += Math.abs(freq2[i] - freq2[9 - i]);
        }
        return sum;
    }
}
