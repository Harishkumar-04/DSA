class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            sb.append(ch);
            else if(sb.length()>0 && ch=='*'){
            sb.deleteCharAt(sb.length()-1);
            System.out.print(sb);
            }
            else if(sb.length()>0 && ch=='#')
            sb.append(sb);
            else
            sb.reverse();
            
        }
        return sb.toString();
    }
}