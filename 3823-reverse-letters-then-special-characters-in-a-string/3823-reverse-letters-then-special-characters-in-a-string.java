class Solution {
    public String reverseByType(String s) {

        StringBuilder lower = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower.append(ch);
            } else {
                symbol.append(ch);
            }
        }

        lower.reverse();
        symbol.reverse();

        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(lower.charAt(i));
                i++;
            } else {
                result.append(symbol.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}