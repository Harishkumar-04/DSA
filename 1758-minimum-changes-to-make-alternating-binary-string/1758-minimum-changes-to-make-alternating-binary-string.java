class Solution {
    public int minOperations(String s) {

        int op1 = 0;
        int op2 = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (i % 2 == 0 && c != '0') op1++;
            else if (i % 2 != 0 && c != '1') op1++;

            if (i % 2 == 0 && c != '1') op2++;
            else if (i % 2 != 0 && c != '0') op2++;
        }

        return Math.min(op1, op2);
    }
}