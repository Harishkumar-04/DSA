class Solution {
    public String maximumXor(String s, String t) {
        int c0=0,c1=0;
        for(char ch:t.toCharArray()){
            if(ch=='0') c0++;
            else c1++;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1' && c0>0){
            sb.append('1');
            c0--;
            }
            else if(ch=='0' && c1>0){
            sb.append('1');
            c1--;
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
}