// worstcase T=O(n × m) best case T=O(n)
//S=O(1) auxiliary (or O(m) including output)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        StringBuilder match = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i))
                    return match.toString();
            }
            match.append(ch);
        }
        return match.toString();
    }
}
