class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n=word.length();

        char c = word.charAt(0);
        int count = 1;

        for (int j = 1; j < n; j++) {
            if (c == word.charAt(j) && count < 9) {
                count++;
            } else {
                sb.append(count).append(c);
                c = word.charAt(j);
                count = 1;
            }
        }
        sb.append(count).append(c);
        return sb.toString();
    }
}