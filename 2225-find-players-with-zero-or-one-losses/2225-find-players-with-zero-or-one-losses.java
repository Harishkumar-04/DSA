class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> win = new ArrayList<>();
        List<Integer> loss = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] x : matches) {
            map.putIfAbsent(x[0], 0);
            map.put(x[1], map.getOrDefault(x[1], 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 0) {
                win.add(num);
            } else if (map.get(num) == 1) {
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