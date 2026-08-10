class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] freq=new int[26];

        for(int i=0;i<freq.length;i++){
            freq[order.charAt(i)-'a']=i;
        }

        for(int i=0;i<words.length-1;i++){
            String a=words[i];
            String b=words[i+1];

            int j=0;

            while(j<a.length() && j<b.length()){
                char x=a.charAt(j);
                char y=b.charAt(j);
                if(x!=y){
                    if(freq[a.charAt(j)-'a']>freq[b.charAt(j)-'a']){
                        return false;
                    }
                    break;
                }
                j++;
            }
            if(j==b.length() && j<a.length()) return false;

        }


        return true;
    }
}