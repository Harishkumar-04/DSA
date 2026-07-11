class Solution {
    public String resultingString(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            int n=sb.length();
            if(n>0){
                char prev=sb.charAt(n-1);
                
                if(Math.abs(prev-ch)==1){
                    sb.deleteCharAt(n-1);
                    }
                else if((prev=='z' && ch=='a') || (prev=='a' && ch=='z')){
                    sb.deleteCharAt(n-1);
                }
                else{
                    sb.append(ch);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}