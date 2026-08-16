class Solution {
    public int minOperations(String s) {

        int ans=Integer.MAX_VALUE;
        for(int k=0;k<s.length() && k<ans;k++){
            String str=s.substring(k)+s.substring(0,k);
            int i=0,j=str.length()-1,op=k;
            while(i<j){
                int x=str.charAt(i)-'a';
                int y=str.charAt(j)-'a';

                //int d=Math.abs(x-y);
                //op+=Math.min(d,26-d);
                op+=Math.min((x-y+26)%26,(y-x+26)%26);
                i++;
                j--;
            }
            ans=Math.min(ans,op);
            //s=s.substring(1)+s.charAt(0);
        }
        return ans;
    }
}