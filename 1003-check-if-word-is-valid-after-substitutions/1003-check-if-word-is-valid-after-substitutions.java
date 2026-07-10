class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='c'){
                if(st.size()<2) return false;

                char b=st.pop();
                char a=st.pop();

                if(a!='a' || b!='b'){
                    return false;
                }
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}