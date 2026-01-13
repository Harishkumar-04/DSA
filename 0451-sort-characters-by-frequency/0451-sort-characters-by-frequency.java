class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1); //{t:1,r:1,e:2}
        }

        List<Character> list=new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b)-map.get(a)); //[e,r,t]

        StringBuilder sb=new StringBuilder(s.length());
        for(char ch:list){   //e
            for(int i=0;i<map.get(ch);i++){  //i=0;i<2, i=1;i<2, (i=2;i<2)No
                sb.append(ch);  //eert
            }
        }
        return sb.toString();
    }
}





