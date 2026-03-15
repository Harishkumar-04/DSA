/*class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;

        long cnt=0;
        if(n>=1000){
            cnt+=(n-1000)+1;
        } 
        if(n>=1000000){
            cnt+=(n-1000000)+1;
        }
        if(n>=1000000000){
            cnt+=(n-1000000000)+1;
        }
        if(n>=1000000000000L){
            cnt+=(n-1000000000000L)+1;
        }
        if(n>=1000000000000000L){
            cnt+=(n-1000000000000000L)+1;
        } 
        return cnt;
    }
}
*/

class Solution {
    public long countCommas(long n) {

        if (n < 1000) return 0;

        long cnt = 0;

        for (int i = 3; i <= 15; i += 3) {

            long level = (long)Math.pow(10, i);

            if (n >= level) {
                cnt += (n - level) + 1;
            }
        }

        return cnt;
    }
}
