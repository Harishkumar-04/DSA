/*class Solution {
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
*/

/*
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }
        int ans = 0;
        for(String s:text.split(" ")){
            boolean type=true;
            for (char ch : s.toCharArray()) {
                if(set.contains(ch)){
                    type=false;
                    break;
                }
            }
            if(type) ans++;
        }
        return ans;
    }
}
*/

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        int count = 0;

        for (String s : text.split(" ")) {
            boolean type = true;

            for (char ch : s.toCharArray()) {
                if (brokenLetters.indexOf(ch) != -1) {
                    type = false;
                    break;
                }
            }

            if (type)
                count++;
        }

        return count;
    }
}
