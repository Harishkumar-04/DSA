class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> match = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < words.length; j++) {
                if (s.length() >= words[j].length())
                    continue;
                if (words[j].contains(s))
                    match.add(s);
            }
        }
        return new ArrayList<>(match);
    }
}