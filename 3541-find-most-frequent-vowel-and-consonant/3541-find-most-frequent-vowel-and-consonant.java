class Solution {
    public int maxFreqSum(String s) {
        char[] freq=new char[26];
        int vmax=0, cmax=0;

        for(char c:s.toCharArray()){
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
                freq[c-'a']++;
                vmax=Math.max(vmax,freq[c-'a']);
            }
            else{
                freq[c-'a']++;
                cmax=Math.max(cmax,freq[c-'a']);
            }
        }
        return vmax+cmax;
    }
}