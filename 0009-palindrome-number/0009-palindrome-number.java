class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        StringBuilder sb=new StringBuilder(String.valueOf(x));
        String res=sb.reverse().toString();
        return res.equals(String.valueOf(x)) ? true : false;
    }   
}