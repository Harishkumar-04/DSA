class Solution {
    public int minSwaps(String s) {
        int open=0;
        //int imbal=0;

        for(char ch:s.toCharArray()){
            if(ch=='[')
            open++;
            else{
                if(open>0)
                open--;
                //else imbal++;
            }

        }
        return (open+1)/2; //return (imbal+1)/2;

    }
}

/*
class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        int unmatch = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    unmatch++;
                }
            }
        }

        return (unmatch + 1) / 2;
    }
}
*/