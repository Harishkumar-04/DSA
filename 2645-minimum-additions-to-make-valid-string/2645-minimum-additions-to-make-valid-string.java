class Solution {
    public int addMinimum(String word) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:word.toCharArray()){
            if(stack.isEmpty()){
                if(ch=='b'){
                    count++;
                    stack.push(ch);
                }
                else if(ch=='a')
                stack.push(ch);
                else{
                    count+=2;
                    stack.push(ch);
                }
            }
            else{
                if(ch=='a' && stack.peek()=='a'){
                count+=2;
                stack.push(ch);
                }
                else if(ch=='b' && stack.peek()=='a'){
                stack.push(ch);
                }
                else if(ch=='c' && stack.peek()=='a'){
                count++;
                stack.push(ch);
                }
                else if(ch=='a' && stack.peek()=='b'){
                count++;
                stack.push(ch);
                }
                else if(ch=='b' && stack.peek()=='b'){
                count+=2;
                stack.push(ch);
                }
                else if(ch=='c' && stack.peek()=='b')
                stack.push(ch);
                else{
                    if(ch=='a' && stack.peek()=='c')
                    stack.push(ch);
                    else if(ch=='b' && stack.peek()=='c'){
                        count++;
                        stack.push(ch);
                    }
                    else{
                        count+=2;
                        stack.push(ch);
                    }
                }
            }
        }
        if(stack.peek()=='b')
        count++;
        if(stack.peek()=='a')
        count+=2;
        return count;       
    }
}