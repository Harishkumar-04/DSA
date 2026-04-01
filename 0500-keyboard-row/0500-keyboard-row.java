class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (char ch : "qwertyuiop".toCharArray()) {
            map.put(ch, 1);
        }
        for (char ch : "asdfghjkl".toCharArray()) {
            map.put(ch, 2);
        }
        for (char ch : "zxcvbnm".toCharArray()) {
            map.put(ch, 3);
        }

        for (String str : words) {
            String s = str.toLowerCase();
            boolean ans = true;

            int n = map.get(s.charAt(0));

            for (int i = 1; i < s.length(); i++) {
                if (map.get(s.charAt(i)) != n) {
                    ans = false;
                    break;
                }
            }

            if (ans) {
                list.add(str);
            }
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}