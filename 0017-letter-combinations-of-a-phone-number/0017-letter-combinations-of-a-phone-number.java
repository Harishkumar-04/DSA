class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        String[] map = { "", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz" };

        ans.add("");

        for (char d : digits.toCharArray()) {
            List<String> temp=new ArrayList<>();
            String letter = map[d - '0'];

            for (String s : ans) {
                for (char c : letter.toCharArray()) {
                    temp.add(s + c);
                }
            }
            ans=temp;
        }
        return ans;
    }
}