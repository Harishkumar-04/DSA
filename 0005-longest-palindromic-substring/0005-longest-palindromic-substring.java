class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                String str = s.substring(i, j);

                int l = 0, r = str.length() - 1;
                boolean isPalindrome = true;

                while (l <= r) {
                    if (str.charAt(l) != str.charAt(r)) {
                        isPalindrome = false;
                        break;
                    }
                    l++;
                    r--;
                }

                if (isPalindrome && str.length() > ans.length()) {
                    ans = str;
                }
            }
        }

        return ans;
    }
}




/*
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