class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int totwt = 0;
        int maxwt = 0;

        for (int w : weights) {
            totwt += w;
            maxwt = Math.max(maxwt, w);
        }

        int avgwt = Math.max(maxwt, totwt / days);

        while (avgwt <= totwt) {

            int i = 0;
            int capacity = 0;
            int countDays = 1;

            while (i < n) {
                if (capacity + weights[i] <= avgwt) {
                    capacity += weights[i];
                    i++;
                } else {
                    countDays++;
                    capacity = 0;
                }

                if (countDays > days)
                    break;
            }

            if (i == n && countDays <= days) {
                return avgwt;
            }

            avgwt++;
        }

        return totwt;
    }
}
