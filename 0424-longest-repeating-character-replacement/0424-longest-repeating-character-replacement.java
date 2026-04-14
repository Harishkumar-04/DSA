class Solution {
    public int characterReplacement(String s, int k) {

        int j=0,max=0,maxFreq=0;
        int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(i)-'A']);

            while((i-j+1)-maxFreq>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}