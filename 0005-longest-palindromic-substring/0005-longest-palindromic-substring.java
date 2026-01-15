//Optimal T=O(n²) S=O(1)

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";

        for (int c = 0; c < s.length(); c++) {
            String odd = expand(s, c, c);
            if (odd.length() > ans.length())
                ans = odd;

            String even = expand(s, c, c + 1);
            if (even.length() > ans.length())
                ans = even;
        }
        return ans;
    }

    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

/* Better T=O(n³) S=O(1)

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    int len = j - i + 1;
                    if (len > ans.length()) {
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
//-----------------------------------------------------------------------------------------------

class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int left = i;
                int right = j;
                boolean isPalindrome = true;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome) {
                    int len = j - i + 1;
                    if (len > ans.length()) {
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;
    }
}

*/


/* Brute Force T=O(n³) S=O(n²)

class Solution {
    public String longestPalindrome(String s) {

        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                list.add(s.substring(i, j));
            }
        }

        for (String str : list) {
            int l = 0, r = str.length() - 1;
            boolean isPalindrome = true;

            while (l <= r) {
                if (str.charAt(l) == str.charAt(r)) {
                    l++;
                    r--;
                } else {
                    isPalindrome = false;
                    break; 
                }
            }

            if (isPalindrome) {
                map.put(str, str.length());
            }
        }

        int max = Integer.MIN_VALUE;
        String ans = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }
}
*/