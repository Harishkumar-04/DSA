class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);

            for (int j = 97; j <= (int) ch; j++) { 

                if ((char) j == ch) {
                    sb.append((char) j);
                    list.add(sb.toString()); 
                } else {
                    sb.append((char) j);
                    list.add(sb.toString()); 
                }

                if ((char) j != ch)
                    sb.deleteCharAt(sb.length() - 1);
            }
        }
        return list;
    }
}    