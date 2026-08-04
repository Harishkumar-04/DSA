class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;

        int cnt=0;

        for(int i=0;i<=s.length()-3;i++){
            String str=s.substring(i,i+3);
            if(str.charAt(0)!=str.charAt(1) && str.charAt(0)!=str.charAt(2) && str.charAt(1)!=str.charAt(2)){
                cnt++;
            }
        }
        return cnt;
    }
}