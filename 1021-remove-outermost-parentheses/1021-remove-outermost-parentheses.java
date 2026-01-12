class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(i>0)
                sb.append(ch);
                i++;
            }
            else{
                i--;
                if(i>0)
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}


    

