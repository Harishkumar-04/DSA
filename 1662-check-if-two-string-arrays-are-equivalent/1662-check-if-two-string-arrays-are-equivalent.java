class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //StringBuilder sb1=new StringBuilder();
    String s1=null,s2=null;
        for(String s:word1){
            s1=s1+s;
            //sb1.append(s);
        }
       // StringBuilder sb2=new StringBuilder();
        for(String s:word2){
           s2+=s;// sb2.append(s);
        }
       // return sb1.toString().equals(sb2.toString());
       return s1.equals(s2);
    }
}