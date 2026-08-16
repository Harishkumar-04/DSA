class Solution {
    public int minOperations(String s) {
        ArrayList<String> list=new ArrayList<>();
        list.add(s);
        for(int i=1;i<s.length();i++){
            list.add(s.substring(i)+s.substring(0,i));
        }

        int ans=Integer.MAX_VALUE;
        for(int k=0;k<list.size();k++){
            String str=list.get(k);
            int i=0,j=str.length()-1,op=k;
            while(i<j){
                int x=str.charAt(i)-'a';
                int y=str.charAt(j)-'a';
                op+=Math.min((x-y+26)%26,(y-x+26)%26);
                i++;
                j--;
            }
            ans=Math.min(ans,op);
        }
        return ans;
    }
}