class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] word = sentence.split(" ");

        for (int i = 0; i < word.length; i++) {

            if (word[i].length() < searchWord.length())
                continue;

            int j;
            for (j = 0; j < searchWord.length(); j++) {
                if (word[i].charAt(j) != searchWord.charAt(j)) {
                    break;
                }
            }

            if (j == searchWord.length())
                return i + 1;
        }
        return -1;
    }
}
