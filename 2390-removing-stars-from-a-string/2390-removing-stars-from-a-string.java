class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch))
            stack.push(ch);
            else
            stack.pop();
        }

        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
