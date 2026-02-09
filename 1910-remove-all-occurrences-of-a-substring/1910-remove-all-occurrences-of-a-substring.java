class Solution {
    public String removeOccurrences(String s, String part) {
        
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            int n=part.length();
            stack.push(c);

            if(stack.peek()==part.charAt(n-1)){

                boolean match=true;
            
                 Stack<Character> temp=new Stack();

                for(int i=n-1;i>=0;i--){
                    if(!stack.isEmpty() &&stack.peek()==part.charAt(i))
                    temp.push(stack.pop());
                    else{
                    match=false;
                    break;
                    }
                }

                if(!match){
                    while(!temp.isEmpty()){
                        stack.push(temp.pop());
                    }
                }
            }
        }
        for(char ch:stack)
        sb.append(ch);

        return sb.toString();
    }
}

