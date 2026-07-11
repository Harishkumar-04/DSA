class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int cnt=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(st.isEmpty()){
                st.push(ch);
                cnt=1;
            }
            else if(!st.isEmpty() && st.peek()!=ch){
                st2.push(cnt);
                cnt=1;
                st.push(ch);
            }
            else{
                st.push(ch);
                cnt++;     
            }
            if(cnt==k){
                while(cnt>0){
                    st.pop();
                    cnt--;
                }
                if (!st2.isEmpty()){
                    cnt=st2.pop();
                }
            }    
            
        }
        
        StringBuilder sb=new StringBuilder();
        int l=st.size();
        for(int i=0;i<l;i++){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
