class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        int i=0,j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        for(int k=0;k<26;k++){
            while(freq[k]>=2){
                sb.setCharAt(i, (char) ('a' + k));
                sb.setCharAt(j, (char) ('a' + k));
                i++;
                j--;
                freq[k]-=2;
            }   
        }
        
        for(int k=0;k<26;k++){
            if(freq[k]==1){
                sb.setCharAt(i, (char) ('a' + k));
            }
        }
        return sb.toString();
    }
}