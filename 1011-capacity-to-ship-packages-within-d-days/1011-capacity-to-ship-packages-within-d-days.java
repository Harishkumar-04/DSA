class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int maxWt = 0, totWt = 0;

        for (int w : weights) {
            maxWt = Math.max(maxWt, w);
            totWt += w;
        }

        if (days == 1)
            return totWt;
        if (days >= weights.length)
            return maxWt;

        int low = maxWt, high = totWt;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w <= capacity) {
                currentLoad += w;
            } else {
                dayCount++;
                currentLoad = w;
            }
        }
        return dayCount <= days;
    }
}
