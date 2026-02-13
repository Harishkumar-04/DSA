class Solution {
    public int minSteps(String s, String t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        int count=0;
        for(int num:freq){
            if(num>0)
            count+=num;
        }
        return count;
    }
}


/*
l e t c o d
1 3 1 1 1 1
1 2 0 0 1 1 = 5

p r a c t i e
1 1 1 2 1 1 1
*/