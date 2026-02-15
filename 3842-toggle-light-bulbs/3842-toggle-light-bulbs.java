class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int num:bulbs){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:map.keySet()){
            if(map.get(num)%2==1)
            list.add(num);
        }
        Collections.sort(list);

        return list;
    }
}