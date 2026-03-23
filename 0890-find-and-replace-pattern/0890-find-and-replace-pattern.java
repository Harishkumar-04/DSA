class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            Map<Character, Character> map = new HashMap<>();

            if (words[i].length() != pattern.length())
                continue;
            for (int j = 0; j < pattern.length(); j++) {
                char key = words[i].charAt(j);
                char value = pattern.charAt(j);
                if (!map.containsKey(key)) {
                    if (map.containsValue(value))
                        break;
                    map.put(key, value);
                } else {
                    if (map.get(key) != value)
                        break;
                }
                if (j == pattern.length() - 1)
                    list.add(words[i]);
            }
        }
        return list;
    }
}