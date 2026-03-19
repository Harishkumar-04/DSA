class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n = brokenLetters.length();
        int ans = 0;

        for (String str : text.split(" ")) {
            int count = 0;
            for (char ch : brokenLetters.toCharArray()) {
                if (str.contains(String.valueOf(ch)))
                    break;
                else
                    count++;
            }
            if (count == n)
                ans++;
        }
        return ans;

    }
}