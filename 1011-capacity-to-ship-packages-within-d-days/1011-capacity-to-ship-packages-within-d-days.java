class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int totwt = 0;

        for (int w : weights)
            totwt += w;

        int avgwt = totwt / days;   // your starting guess

        while (true) {              // retry loop
            int i = 0;
            int capacity = 0;
            int countDays = 1;      // start with day 1

            while (i < n) {         // safe bound
                if (capacity + weights[i] <= avgwt) {
                    capacity += weights[i];
                    i++;
                } else {
                    countDays++;   // move to next day
                    capacity = 0;
                }

                if (countDays > days)
                    break;
            }

            if (i == n && countDays <= days) {
                return avgwt;       // success
            }

            avgwt++;                // try bigger capacity
        }
    }
}
