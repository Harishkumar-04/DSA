class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int[] freq=new int[26];
        int maxLen=0;
        
        int i=0;
        for(int j=0;j<n;j++){
            freq[s.charAt(j)-'a']++;

            boolean check=true;
            for(int k=0;k<26;k++){
                if(freq[k]>2){
                    while(freq[k]>2){
                        freq[s.charAt(i)-'a']--;
                        i++;
                    }
                }
            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}