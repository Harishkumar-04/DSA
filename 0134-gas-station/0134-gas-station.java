class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        for (int i = 0; i < n; i++) {

            if (gas[i] >= cost[i]) {

                int mov = 0;
                int idx = i;
                int curr = idx;
                int steps = 0;

                while (steps < n) {

                    mov += gas[curr];
                    mov -= cost[curr];

                    if (mov < 0) break;

                    curr = (curr + 1) % n;
                    steps++;

                    if (curr == idx) return idx;
                }

                i = i + steps;
            }
        }

        return -1;
    }
}