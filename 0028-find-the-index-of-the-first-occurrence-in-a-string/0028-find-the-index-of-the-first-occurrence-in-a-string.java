
class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int h=haystack.length();
        
        for(int i=0;i<=h-n;i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    if(haystack.startsWith(needle,i))
                    return i;
                }               
            }
        return -1;
    }
}



