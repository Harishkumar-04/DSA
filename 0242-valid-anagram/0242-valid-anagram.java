/* Brute Force TLE
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int countS = 0;
            int countT = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch)
                    countS++;
                if (t.charAt(j) == ch)
                    countT++;
            }
            if (countS != countT)
                return false;
        }
        return true;
    }
}
*/
// Better
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
        
    }
}

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int check : freq) {
            if (check != 0)
                return false;
        }
        return true;
    }
}
*/