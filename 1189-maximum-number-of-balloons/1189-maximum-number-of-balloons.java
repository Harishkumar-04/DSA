class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] freq=new int[26];

        for(char ch:text.toCharArray()){
            freq[ch-'a']++;
        }

        int b=freq['b'-'a'];
        int a=freq['a'-'a'];
        int l=freq['l'-'a']/2;
        int o=freq['o'-'a']/2;
        int n=freq['n'-'a'];

        return Math.min(Math.min(Math.min(a,b),Math.min(l,o)),n);
    }
}





/*class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();

        for(char ch:text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int b=map.getOrDefault('b',0);
        int a=map.getOrDefault('a',0);
        int l=map.getOrDefault('l',0)/2;
        int o=map.getOrDefault('o',0)/2;
        int n=map.getOrDefault('n',0);
         
        
        return Math.min(Math.min(Math.min(a,b),Math.min(l,o)),n);
    }
}
*/