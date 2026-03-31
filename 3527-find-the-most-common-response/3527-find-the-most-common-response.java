class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < responses.size(); i++) {
            Set<String> set = new HashSet<>(responses.get(i));

            for (String s : set) {
                int count = map.getOrDefault(s, 0) + 1;
                map.put(s, count);
            }
        }

        int max = 0;
        String ans = "";

        for (String s : map.keySet()) {
            int count = map.get(s);

            if (count > max) {
                max = count;
                ans = s;
            }
        }

        return ans;
    }
}