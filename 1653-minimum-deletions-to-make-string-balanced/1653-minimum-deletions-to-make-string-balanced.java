/*class Solution {
    public int minimumDeletions(String s) {
        int countb=0,delete=0;

        for(char ch:s.toCharArray()){
            if(ch=='b')
            countb++;
            else
            delete=Math.min(delete+1,countb);
        }
        return delete;
    }
}
*/
class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;

        for(char ch:s.toCharArray()){
            if(ch=='b')
            st.push(ch);
            else{
                if(!st.isEmpty()){
                    st.pop();
                    count++;
                }
            }
        }
        return count;
    }
}

       