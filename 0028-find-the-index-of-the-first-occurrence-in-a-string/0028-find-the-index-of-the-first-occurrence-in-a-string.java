class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int h=haystack.length();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<h;j++){
                if(haystack.charAt(j)==needle.charAt(i)){
                    if(haystack.startsWith(needle,j))
                    return j;
                }               
            }
        }
        return -1;
    }
}