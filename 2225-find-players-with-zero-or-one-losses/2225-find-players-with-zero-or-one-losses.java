class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> win = new ArrayList<>();
        List<Integer> loss = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int[] x : matches) {
            map1.put(x[0], map1.getOrDefault(x[0], 0) + 1);
            
        }
        for(int[] x:matches){
            if(map1.containsKey(x[1])){
            map1.remove(x[1]);
            }
            map2.put(x[1], map2.getOrDefault(x[1], 0) + 1);
        }

        for (int num : map1.keySet()) {
            win.add(num);
        }

        for (int num : map2.keySet()) {
            if(map2.get(num)==1){
                loss.add(num);
            }
        }

        Collections.sort(win);
        Collections.sort(loss);
        result.add(win);
        result.add(loss);

        return result;
    }
}