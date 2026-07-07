class Solution {
    public long sumAndMultiply(int n) {
        int rev=reverse(n);
        int sum=digitSum(n);
        return (long) reverse(rev)*sum;
    }

    private int reverse(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
            if(rem!=0){
                rev=rev*10+rem;
            }
            num/=10;
        }
        return rev;
    }

    private int digitSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}