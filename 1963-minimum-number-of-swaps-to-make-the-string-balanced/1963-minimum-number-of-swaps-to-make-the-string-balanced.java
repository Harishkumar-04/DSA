class Solution {
    public int minSwaps(String s) {
        int i=0,j=0;

        for(char ch:s.toCharArray()){
            if(ch=='[')
            i++;
            else 
            i--;

            j=Math.min(j,i);
        }
        return (-j+1)/2;
    }
}
