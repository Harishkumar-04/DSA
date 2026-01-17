class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int totwt = 0;
        int maxwt = 0;

        for (int w : weights) {
            totwt += w;
            maxwt = Math.max(maxwt, w);
        }

        if (days == 1)
            return totwt;
        if (days >= n)
            return maxwt;

        while (maxwt <= totwt) {

            int i = 0;
            int capacity = 0;
            int countDays = 1;

            while (i < n) {
                if (capacity + weights[i] <= maxwt) {
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
                return maxwt;
            }

            maxwt++;
        }

        return totwt;
    }
}
