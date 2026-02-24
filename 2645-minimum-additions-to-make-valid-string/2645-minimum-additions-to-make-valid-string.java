class Solution {
    public int addMinimum(String word) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch : word.toCharArray()) {

            if (!stack.isEmpty()) {
                char prev = stack.peek();

                if (prev == 'a' && ch == 'c')
                    count++;
                else if (prev == 'b' && ch == 'a')
                    count++;
                else if (prev == 'c' && ch == 'b')
                    count++;
                else if (prev == ch)
                    count += 2;
            } else {
                if (ch == 'b')
                    count++;
                else if (ch == 'c')
                    count += 2;
            }

            stack.push(ch);
        }

        char last = stack.peek();
        if (last == 'a')
            count += 2;
        else if (last == 'b')
            count += 1;

        return count;
    }
}