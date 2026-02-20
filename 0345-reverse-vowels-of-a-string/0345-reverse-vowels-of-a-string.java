class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' || ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
            sb.append(ch);
        }
        char[] str=sb.toString().toCharArray();
        int i=str.length-1;

        StringBuilder sb1=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' || ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            sb1.append(str[i]);
            i--;
            }
            else sb1.append(ch);
        }
        return sb1.toString();       
    }
}