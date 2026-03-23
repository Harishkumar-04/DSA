public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int bharath = guess(mid);

            if(bharath==0){
                return mid;
            }
            else if(bharath==-1){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
    
    }
}