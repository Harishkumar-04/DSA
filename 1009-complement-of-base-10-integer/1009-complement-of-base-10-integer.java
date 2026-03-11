class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        
        int temp=n;
        int ones=0;    

        while(temp>0){
            ones=ones*2+1;
            temp/=2;
        }
        return n^ones;
        
    }
}