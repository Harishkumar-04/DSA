class Solution {
    public int beautySum(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int min = Integer.MAX_VALUE;
                int max = 0;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }

                count += (max - min);
            }
        }
        return count;
    }
}


/*
class Solution {
    public int beautySum(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
             Map<Character, Integer> map = new HashMap<>();
             
             for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;

                int beauty=0;
                for(int freq:map.values()){
                    max=Math.max(max,freq);
                    min=Math.min(min,freq); 
                    beauty=max-min;
                }
                count+=beauty;
             }
        }
        return count;
    }
}
*/                