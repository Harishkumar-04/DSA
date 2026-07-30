class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        if(str.length()<k) return 0;

        int i=0,cnt=0;
        for(int j=0;j<=str.length()-k;j++){
            String sub=str.substring(j,j+k);
            int val=Integer.parseInt(sub);

            if(val!=0 && num%val==0) cnt++;
        }
        return cnt;
    }
}