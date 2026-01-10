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
