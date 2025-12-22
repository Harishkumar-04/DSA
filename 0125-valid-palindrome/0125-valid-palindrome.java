class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        // Step 1: build cleaned lowercase string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        // Step 2: two-pointer check
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
