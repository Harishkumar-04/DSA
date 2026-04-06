class Solution {
    public boolean judgeCircle(String moves) {

        int U=0,D=0,L=0,R = 0;

        for(int i=0;i<moves.length();i++){
            char C=moves.charAt(i);
            if(C=='U') U++;
            else if(C=='D') D++;
            else if(C=='L') L++;
            else R++;

        } 
        if(U==D && L==R)   
        return true;
        else
        return false;    
    }
}