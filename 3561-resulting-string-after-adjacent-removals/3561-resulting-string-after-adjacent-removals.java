class Solution {
    public String resultingString(String s) {
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==1){
                st.pop();
            }
            else if(!st.isEmpty() && ((st.peek()=='z' && ch=='a') || (st.peek()=='a' && ch=='z'))){
                st.pop();
            }
            else{
                st.push(ch);
            }
            
        }
        StringBuilder sb=new StringBuilder(st.size());        

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}