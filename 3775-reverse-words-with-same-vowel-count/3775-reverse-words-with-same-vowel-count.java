class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        
        int first=countVowels(words[0]);
        sb.append(words[0]).append(" ");

        for(int i=1;i<words.length;i++){
            int curr=countVowels(words[i]);
            if(curr==first){
                sb.append(new StringBuilder(words[i]).reverse());
            }
            else{
                sb.append(words[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private int countVowels(String str){
        int count=0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}