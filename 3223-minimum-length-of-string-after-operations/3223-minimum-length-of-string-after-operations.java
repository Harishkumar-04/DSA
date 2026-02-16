class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0;

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.get(ch)>=3){
                map.put(ch,map.get(ch)-2);
            }
        }
        for(int num:map.values())
        res+=num;
            

        return res;
    }
    
}