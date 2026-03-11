/*
class Solution {
    public int numberOfBeams(String[] bank) {
        int sum=0;
        for(int i=0;i<bank.length;i++){
            char[] str=bank[i].toCharArray();
            int count=0;
            for(char ch:str){
                if(ch=='1') count++;
            }
            if(count==0) continue;
            for(int j=i+1;j<bank.length;j++){
                char[] str2=bank[j].toCharArray();
                int count2=0;
                for(char ch:str2){
                   if(ch=='1') count2++;
                }
                sum+=count*count2;
                if(count2!=0) break;
            }
        }
        return sum;
    }
}
*/

class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0,res=0;


        for(String s:bank){
            int count=0;
            for(char ch:s.toCharArray()){
                if(ch=='1') count++;
            }
            if(count>0){
                res+=prev*count;
                prev=count;
            }
        }
        return res;
    }
}
