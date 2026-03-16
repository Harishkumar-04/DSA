class Solution {
    public int maximumValue(String[] strs) {
        int max = -1;
        for (String s : strs) {
            boolean num = true;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    num = false;
                }
            }

            if (num == false) {
                max = Math.max(max, s.length());
            } else {
                max = Math.max(max, Integer.parseInt(s));
            }
        }
        return max;
    }
}