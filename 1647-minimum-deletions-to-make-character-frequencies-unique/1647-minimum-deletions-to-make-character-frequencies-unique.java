class Solution {
    public int minDeletions(String s) {
        Set<Integer> set = new HashSet<>();
        int count=0;

        int[] freq=new int[26];
        for (char c:s.toCharArray()) {
            freq[c-'a']++;
        }

        for (int num:freq) {
            while(num>0 && set.contains(num)) {
                num--;
                count++;
            }
            set.add(num);
        }
        return count;
    }
}