class Solution {
    public int findGCD(int[] nums) {
        int s=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        for(int num:nums){
            s=Math.min(s,num);
            l=Math.max(l,num);
        } 
        return gcd(s,l); 
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