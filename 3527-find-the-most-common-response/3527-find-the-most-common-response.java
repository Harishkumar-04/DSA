class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Set<String> set=new HashSet<>();
        Map<String,Integer> map=new TreeMap<>();

        for(int i=0;i<responses.size();i++){
            set.addAll(responses.get(i));

            for(String s:set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
            set.clear();
        }

        int max=Integer.MIN_VALUE;
        String key = "";
        
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
        
    }
}