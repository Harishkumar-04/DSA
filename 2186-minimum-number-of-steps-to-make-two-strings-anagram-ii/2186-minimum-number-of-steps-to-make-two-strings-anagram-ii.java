class Solution {
    public int minSteps(String s, String t) {
        int length=s.length()+t.length();
        int[] freqS=new int[26];
        int[] freqT=new int[26];

        for(int i=0;i<s.length();i++){
            freqS[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freqT[t.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.min(freqS[i],freqT[i]);
        }
        return length-2*count;
    }
}


