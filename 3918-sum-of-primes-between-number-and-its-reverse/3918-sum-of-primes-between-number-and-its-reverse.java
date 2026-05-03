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
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                    if(count>2) break;
                }
            }
            if(count==2){
                tot+=i;
            }
        }
        return tot;
    }
}