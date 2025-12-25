/* Brute Force TLE

class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch)
                    count++;
            }
            if (count == 1)
                return i;
        }
        return -1;
    }
}

class Solution {
    public int firstUniqChar(String s) {

        int[] freq=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1)
            return i;
        }
        return -1;
    }
}

*/

class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[256];
        char[] chars = s.toCharArray();

        for (char c : chars) {
            freq[c]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i]] == 1) {
                return i;
            }
        }
        return -1;
         
        
    }
}