class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        Map<Character,Integer> map=new HashMap<>();

        for(int j=0;j<garbage.length;j++){
            for(char l:garbage[j].toCharArray()){
                map.put(l,map.getOrDefault(l,0)+1);
            }
        }
        int count=0;
        for(char c:map.keySet()){
            int val=map.get(c);

            for(int j=0;j<garbage.length;j++){
                for(char l:garbage[j].toCharArray()){
                    if(c==l){
                        count++;
                        val--;
                    }
                }
                if(j<travel.length && val>0)
                count+=travel[j];
            }
        }
        return count;
    }
}