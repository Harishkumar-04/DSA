class Solution {
    public boolean checkStrings(String s1, String s2) {

        if (s1.equals(s2)) return true;

        Map<Character, Integer> evenMap = new HashMap<>();
        Map<Character, Integer> oddMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (i % 2 == 0) {
                evenMap.put(c1, evenMap.getOrDefault(c1, 0) + 1);
                evenMap.put(c2, evenMap.getOrDefault(c2, 0) - 1);
            } else {
                oddMap.put(c1, oddMap.getOrDefault(c1, 0) + 1);
                oddMap.put(c2, oddMap.getOrDefault(c2, 0) - 1);
            }
        }

        for (int val : evenMap.values()) {
            if (val != 0) return false;
        }

        for (int val : oddMap.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}