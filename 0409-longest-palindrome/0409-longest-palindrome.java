class Solution {
    public int longestPalindrome(String s) {
        
        int[] freq=new int[128];
        int len=s.length();

        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
        }

        int count=0;
        boolean odd=false;
        for(int val:freq){
            if(val % 2 == 0)
            count+=val;
            else{
                count+=val-1;
                odd=true;
            }
        }
        if(odd) count+=1;
        return count;
    }
}