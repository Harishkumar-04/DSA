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
        int start, end;
        if(original>rev){
            end=original;
            start=rev;
        }else{
            start=original;
            end=rev;
        }

        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                tot+=i;
            }
        }
        return tot;
    }

    boolean isPrime(int num){
        if(num<2) return false;

        for(int j=2;j*j<=num;j++){
            if(num%j==0) return false;
        }
        return true;
    }
}