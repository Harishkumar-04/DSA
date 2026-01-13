//T=O(n + k log k) S=O(n)

class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        //{t:1, r:1, e:2}
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //[e, r, t]
        PriorityQueue<Character> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder(s.length());

        while (!pq.isEmpty()) {
            char ch = pq.poll();   // e
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);     // ee -> eer -> "eert"
            }
        }

        return sb.toString();
    }
}

/*

//T=O(n + k log k) S=O(n)

class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        //{t:1, r:1, e:2}
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //[t, r, e]
        List<Character> list = new ArrayList<>(map.keySet());

        //[e, r, t]
        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder(s.length());

        for (char ch : list) {        // e
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);        // ee -> eer -> "eert"
            }
        }

        return sb.toString();
    }
}

/*

/*

//T=O(n log n) S=O(n)

class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        //{t:1, r:1, e:2}
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        Character[] arr = new Character[s.length()];

        //[t, r, e, e]
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
        //[e, e, r, t]
        Arrays.sort(arr, (a, b) -> {
            if (freq[a] == freq[b]) {
                return a - b;           
            }
            return freq[b] - freq[a];  
        });

        StringBuilder sb = new StringBuilder(s.length());

        //"eert"
        for (char ch : arr) {
            sb.append(ch);
        }

        return sb.toString();
    }
}

*/