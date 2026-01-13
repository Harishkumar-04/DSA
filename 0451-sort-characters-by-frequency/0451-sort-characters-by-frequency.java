class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1); //{t:1,r:1,e:2}
        }

        Queue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet()); //{e,r,t}

        StringBuilder sb = new StringBuilder(s.length());

        while (!pq.isEmpty()) {
            char ch = pq.poll();

            for (int i = 0; i < map.get(ch); i++)
                sb.append(ch);
        }

        return sb.toString();
    }
}
