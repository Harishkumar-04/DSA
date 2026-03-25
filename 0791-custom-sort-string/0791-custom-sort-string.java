class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        List<Character> list = new ArrayList<>();

        for (char ch : order.toCharArray()) {
            list.add(ch);
        }

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : list) {
            if (map.containsKey(ch)) {
                for (int i = 0; i < map.get(ch); i++) {
                    sb.append(ch);
                }
                map.remove(ch);

            } else
                continue;

        }

        for (char ch : map.keySet()) {
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}