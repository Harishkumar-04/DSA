class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq=new int[26];
        int count=0;

        for(char c:allowed.toCharArray()){
            freq[c-'a']++;
        }
        for(String word:words){
            Boolean isConsistent =true;
            for(char c:word.toCharArray()){
                if(freq[c-'a']==0){
                    isConsistent =false;
                    break;
                }
            }
            if(isConsistent)
            count++;
        }
        return count;
    }
}