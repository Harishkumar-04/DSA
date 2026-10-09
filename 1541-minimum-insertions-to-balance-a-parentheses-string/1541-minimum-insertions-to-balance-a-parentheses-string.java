class Solution {
    public int minInsertions(String s) {
        int reqc = 0, reqo = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                reqc += 2;
            } 
            else {
                reqc--;

                if (reqc < 0) {
                    reqo++;
                    reqc = 1;
                }

                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    reqc--;
                    i++;
                } 
                else {
                    reqc--;  // Account for the missing second ')'
                    reqo++; // Insert the missing ')'
                }
            }
        }

        return reqc + reqo;
    }
}