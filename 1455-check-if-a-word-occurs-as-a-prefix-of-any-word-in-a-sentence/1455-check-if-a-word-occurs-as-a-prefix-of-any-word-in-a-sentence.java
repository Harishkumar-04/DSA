/* T=O(n × m) S=O(n)

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() < searchWord.length()) continue;

            boolean isPrefix = true;
            for (int j = 0; j < searchWord.length(); j++) {
                if (words[i].charAt(j) != searchWord.charAt(j)) {
                    isPrefix = false;
                    break;
                }
            }
            if (isPrefix) return i + 1;
        }
        return -1;
    }
}
*/
// T=O(n × m) S=O(n)

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<searchWord.length()) continue;
            if(words[i].startsWith(searchWord))
            return i+1;
        }
        return -1;
    }
}

