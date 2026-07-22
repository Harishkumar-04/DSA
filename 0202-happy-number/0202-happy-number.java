class Solution {
    public boolean isHappy(int n) {

        while(n!=1 && n!=4){
            n=sumOfSq(n);
        }
        return n==1;
    }

    private int sumOfSq(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem*rem;
            num/=10;
        }
        return sum;
    }
}