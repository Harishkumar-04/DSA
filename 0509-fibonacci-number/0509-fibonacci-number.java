class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        int a=0,b=1;
        return fibo(a,b,n-1);
    }
    public int fibo(int a,int b, int n){
        if(n==0)
        return b;

        int c=a+b;
        return fibo(b,c,n-1);
    }
}