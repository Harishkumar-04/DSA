class Solution {
    public int differenceOfSums(int n, int m) {
        int totSum = n * (n + 1) / 2; //sum of 1 to n numbers
        int k = n / m; //k=10/3 -> between 1 to 10, 3 numbers divisible by 3  -> 3,6,9
        int divSum = m * k * (k + 1) / 2; // 3+6+9=18 -> 3*(1+2+3)=18 -> 3*6=18 -> m*(k*(k+1)/2)
        return totSum - 2 * divSum;
    }
}

//totSum = nonDivSum + divSum 
//nonDivSum = (totSum-divSum)
//asking (totSum-divSum)-divSum -> totSum - 2 * divSum

/*class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0, nonDiv = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0)
                nonDiv += i;
            else
                div += i;
        }
        return nonDiv - div;
    }
}
*/