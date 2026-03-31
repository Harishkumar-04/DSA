/*
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
*/

class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        String key = "";

        for (int i = 0; i < responses.size(); i++) {
            Set<String> set = new HashSet<>(responses.get(i));

            for (String s : set) {
                int count = map.getOrDefault(s, 0) + 1;
                map.put(s, count);


                if (count > max || (count == max && s.compareTo(key) < 0)) {
                    max = count;
                    key = s;
                }
            }
        }
        return key;

    }
}