class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        int totalGas = 0;
        int totalCost = 0;

        for(int i = 0; i < n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost) return -1;

        int mov = 0;

        for (int i = 0; i < n; ) {

            mov = 0;
            int j = 0;

            while (j < n) {

                int station = (i + j) % n;

                mov += gas[station];
                mov -= cost[station];

                if (mov < 0) {
                    break;
                }

                j++;
            }

            if (j == n) return i;

            i = i + j + 1;   
        }

        return -1;
    }
}