class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;

            int end=i;

            while(i>=0 && s.charAt(i)!=' ') i--;

            int start=i+1;

            sb.append(s.substring(start, end+1)).append(' ');
        }
        return sb.toString().trim();
    }
}




















/*
class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
*/