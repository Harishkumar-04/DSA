class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int i=0,count=0;
        for(char ch:s.toCharArray()){
            if(i<spaces.length && spaces[i]==count){
            sb.append(" ");
            i++;
            }
            sb.append(ch);
            count++;
        }
        return sb.toString();
        
    }
}