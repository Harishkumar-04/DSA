class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count=0;
        boolean odd=false;
        for(int val:map.values()){
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