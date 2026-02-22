class Solution {
    public int binaryGap(int n) {
        StringBuilder sb=new StringBuilder();

        String s=Integer.toBinaryString(n);
        int l=0,r=l+1,max=0;


        while(r<s.length()){
            if(s.charAt(l)== '1' && s.charAt(r)=='1'){
                max=Math.max(max,r-l);
                l=r;
            }
            r++;
        }
        return max; 
    }
}