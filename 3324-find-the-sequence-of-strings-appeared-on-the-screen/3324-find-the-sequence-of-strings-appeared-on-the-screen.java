class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);

            for (char c = 'a'; c <= ch; c++) {
                sb.append(c);
                list.add(sb.toString());

                if (c != ch){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return list;
    }
}