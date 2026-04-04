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

        StringBuilder result = new StringBuilder();
        int i = lower.length()-1;
        int j = symbol.length()-1;

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(lower.charAt(i));
                i--;
            } else {
                result.append(symbol.charAt(j));
                j--;
            }
        }

        return result.toString();
    }
}