class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ans=x;

        int pal=0,cnt=0;
        while(x>0){
            int rem=x%10;
            pal=cnt*10+rem;
            cnt=pal;
            x/=10;
        }
        System.out.print(pal);
        if(pal==ans) return true;
        
        return false;
    }
}