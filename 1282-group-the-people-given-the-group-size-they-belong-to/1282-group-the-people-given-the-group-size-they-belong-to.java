class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int key = groupSizes[i];
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(i);

            if(map.get(key).size()==key){
                list.add(new ArrayList<>(map.get(key)));
                map.get(key).clear();
            }
        }
        return list;
        

       
    }

}