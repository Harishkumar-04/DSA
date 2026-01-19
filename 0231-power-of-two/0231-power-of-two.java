// O(1) O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}

/*

For any power of two n
n & (n - 1) == 0

      n = 16 -> 10000
(n - 1) = 15 -> 01111
         AND -> 00000 → true

      n = 12 -> 1100
(n - 1) = 11 -> 1011
         AND -> 1000 → false

/*
------------------------------------------
/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}
*/
