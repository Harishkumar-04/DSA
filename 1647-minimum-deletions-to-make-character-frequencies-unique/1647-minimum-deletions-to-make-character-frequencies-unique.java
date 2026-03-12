class Solution {
    public int minDeletions(String s) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        for (int num : freq) {

            if (!set.contains(num)) {
                set.add(num);
            } 
            else {
                while (num > 0) {
                    num--;
                    count++;

                    if (!set.contains(num)) {
                        set.add(num);
                        break;
                    }
                }
            }
        }
        return count;
    }
}