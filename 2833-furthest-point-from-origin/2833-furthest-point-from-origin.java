class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r=0,l=0,us=0;
        for(char ch:moves.toCharArray()){
            if(ch=='R') r++;
            else if(ch=='L') l++;
            else us++;
        }
        return Math.abs(r-l)+us;      
    }
}

