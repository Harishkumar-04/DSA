class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=0,evenSum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        int ans=gcd(oddSum,evenSum);
        return ans;
    }
    
    private int gcd(int a, int b){
        while(b>0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;

    }
}
