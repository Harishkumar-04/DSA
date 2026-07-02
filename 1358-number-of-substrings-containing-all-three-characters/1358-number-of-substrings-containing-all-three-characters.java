/* TLE
class Solution {
    public int numberOfSubstrings(String s) {
        int count=0,n=s.length();

        for(int i=0;i<n;i++){
            int[] hash=new int[3];
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3){
                    count+=n-j;
                    break;
                }
            }
        }
        return count;
    }
}
*/
class Solution {
    public int numberOfSubstrings(String s) {
        int count=0,n=s.length();
        int a=-1,b=-1,c=-1;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='a') a=i;
            else if(ch=='b') b=i;
            else c=i;

            count+=Math.min(a,Math.min(b,c))+1;
        }
        return count;
    }
}
