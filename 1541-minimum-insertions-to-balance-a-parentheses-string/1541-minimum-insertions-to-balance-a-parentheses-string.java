class Solution {
    public int minInsertions(String s) {
        int c=0;
        int i=0;

        for (int j=0;j<s.length();j++) {
            char ch=s.charAt(j);

            if(ch=='(') {
                c+=2;
            } 
            else{
                c--;

                if(c<0){
                    i++;
                    c=1;
                }

                if(j+1<s.length() && s.charAt(j+1)==')'){
                    c--;
                    j++;
                } 
                else{
                    c--;
                    i++;
                }
            }
        }

        return c+i;
    }
}