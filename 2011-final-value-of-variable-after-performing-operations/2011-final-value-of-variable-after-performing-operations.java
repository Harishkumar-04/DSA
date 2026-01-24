class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String str:operations){
            if(str.charAt(1)=='+') X++;
            else X--;
        }
        return X;
    }
}


/*
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String str:operations){
            if(str.equals("++X") || str.equals("X++")) ? ++result : --result;
        }
        return result;
    }
}
*/

/*
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String str:operations){
            if(str.equals("++X") || str.equals("X++")) X++;
            else X--;
        }
        return X;
    }
}
*/