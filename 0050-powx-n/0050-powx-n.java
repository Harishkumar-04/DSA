// O(log |n|) 
class Solution {
    public double myPow(double x, int n) {

        if (n == 0)
            return 1.0;

        long power = Math.abs((long) n);
        double result = 1.0;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        if (n < 0) {
            result = 1.0 / result;
        }
        return result;
    }
}

/* O(n)
class Solution {
    public double myPow(double x, int n) {

        if (n == 0)
            return 1.0;

        long power = Math.abs((long) n);
        double result = 1.0;

        for (long i = 0; i < power; i++) {
            result *= x;
        }

        if (n < 0) {
            result = 1.0 / result;
        }
        return result;
    }
}
*/