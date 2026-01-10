/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (!map.containsKey(key)) {
                if (map.containsValue(value)) return false;
                map.put(key, value);
            } else if (map.get(key) != value) {
                return false;
            }
        }
        return true;
    }
}
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sarr=new int[256];
        int[] tarr=new int[256];

        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);

            if(sarr[sc]!=tarr[tc]) return false;

            sarr[sc]=i+1;
            tarr[tc]=i+1;
        }
        return true;
    }
}

