class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int original=n;

        while(n!=0){
            int num=n%10;
            rev=rev*10+num;
            n=n/10;
        }

        int tot=0;
        int start=Math.min(original,rev);
        int end=Math.max(original,rev);

        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                tot+=i;
            }
        }
        return tot;
    }

    boolean isPrime(int num){
        if (num<2) return false;
        if (num==2) return true;

        if (num%2==0) return false;

        for(int j=3;j*j<=num;j+=2){
            if(num%j==0) return false;
        }
        return true;
    }
}