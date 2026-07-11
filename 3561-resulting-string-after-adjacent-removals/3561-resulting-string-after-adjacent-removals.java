class Solution {
    public String resultingString(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            int n=sb.length();
            if(n>0 && Math.abs(sb.charAt(n-1)-ch)==1){
                sb.deleteCharAt(n-1);
            }
            else if(n>0 && ((sb.charAt(n-1)=='z' && ch=='a') || (sb.charAt(n-1)=='a' && ch=='z'))){
                sb.deleteCharAt(n-1);
            }
            else{
                sb.append(ch);
            }
            
        }
    
        return sb.toString();
    }
}