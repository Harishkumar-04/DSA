class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < responses.size(); i++) {
            Set<String> set = new HashSet<>(responses.get(i));

            for (String s : set) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        int max = 0;
        String key = "";

        for (String s : map.keySet()) {
            int value = map.get(s);

            if (value > max || (value == max && s.compareTo(key) < 0)) {
                max = value;
                key = s;
            }
        }
        return key;
    }
}