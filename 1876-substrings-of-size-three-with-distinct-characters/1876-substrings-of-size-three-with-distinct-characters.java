class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;

        int cnt=0;

        for(int i=0;i<=s.length()-3;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<i+3;j++){
                sb.append(s.charAt(j));
            }
            String str=sb.toString();
            if(str.charAt(0)!=str.charAt(1) && str.charAt(0)!=str.charAt(2) && str.charAt(1)!=str.charAt(2)){
                cnt++;
            }
        }
        return cnt;
    }
}