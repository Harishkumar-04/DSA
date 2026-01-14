class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;

        String str = s.trim();
        if (str.length() == 0) return 0;

        StringBuilder sb = new StringBuilder();
        boolean signUsed = false;

        for (char ch : str.toCharArray()) {

            // stop if character is not digit or sign
            if (!Character.isDigit(ch) && ch != '-' && ch != '+') {
                break;
            }

            // allow sign only once and only at start
            if (ch == '-' || ch == '+') {
                if (signUsed || sb.length() > 0) break;
                signUsed = true;
                sb.append(ch);
            } 
            else {
                sb.append(ch);
            }
        }

        // handle empty or invalid cases
        if (sb.length() == 0 || sb.toString().equals("-") || sb.toString().equals("+"))
            return 0;

        // handle overflow safely
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
