class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            while (freq > 0 && set.contains(freq)) {
                freq--;
                count++;
            }

            set.add(freq);
        }

        return count;
    }
}